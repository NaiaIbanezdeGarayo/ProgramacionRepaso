package com.mycompany.dommainalojamientomaven;

import com.mycompany.domalojamiento.Alojamiento;
import com.mycompany.domalojamiento.ReadAlojamientoXML;
import com.mycompany.excepciones.EtiquetaNotFound;
import java.io.IOException;
import java.io.StringReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author Adrian
 */
public class MainParserDom {
     public static void main(String[] args) {

        System.out.println("--- DOM (lectura) ---\n");

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            InputSource datos = new InputSource(new StringReader(ReadAlojamientoXML.datosAlojamientos("http://opendata.euskadi.eus/contenidos/ds_eventos/agenda_cultura_euskadi/es_kultura/adjuntos/kulturklik.xml")));

            Document doc = dBuilder.parse(datos);
            doc.getDocumentElement().normalize();

            System.out.println("Elemento raiz: " + doc.getDocumentElement().getNodeName());

            NodeList nodos = doc.getElementsByTagName("row");

            List<Alojamiento> alojamientos = new ArrayList<>();
            for (int i = 0; i < nodos.getLength(); i++) {
                System.out.println("row " + i);
                alojamientos.add(getAlojamiento(nodos.item(i)));
            }


            for (Alojamiento a : alojamientos)
                System.out.println(a);

        } catch (SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }

    }

    private static Alojamiento getAlojamiento(Node nodo) {

        Alojamiento oAlojamiento = new Alojamiento();

        if (nodo.getNodeType() == Node.ELEMENT_NODE) {

            Element element = (Element) nodo;
            
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            //ID, nombre, fecha
            oAlojamiento.setId(Integer.parseInt(element.getAttribute("num")));
            oAlojamiento.setNombre(obtenerValor("documentname", element));
            oAlojamiento.setFecha(LocalDate.parse(obtenerValor("eventstartdate", element), df));
            
            //Lugar
            String ciudad = obtenerValor("municipionombre", element);
            String lugar = obtenerValor("eventwhere", element);
            if(lugar == null)
                oAlojamiento.setLugar(ciudad);
            else
                oAlojamiento.setLugar(ciudad + ", " + lugar);

            //Precio
            String precio = obtenerValor("eventprice", element);
            if(precio != null)
                oAlojamiento.setPrecio(precio);
        }

        return oAlojamiento;
    }

    /**
     * Obtener el valor (#PCDATA) de un elemento del Ã¡rbol XML
     *
     * @param tag     La etiqueta del elemento
     * @param element Nodo de partida
     * @return Texto recuperado
     */
    
    
    private static String obtenerValor(String tag, Element element) {
        
        Node nodo;
        
        try{
            NodeList nodos = element.getElementsByTagName(tag).item(0).getChildNodes();
            nodo = nodos.item(0);
            System.out.println(tag);
        }
        catch(Exception e){
            System.out.println("NO EXISTE ESA ETIQUETA");
            return null;
        }
        
        return nodo.getNodeValue();
    }

    /**
     * Obtener un subelemento anidado a partir de otro dado
     *
     * @param tag     La etiqueta del elemento
     * @param element Nodo de partida
     * @return Subelemento recuperado
     */
    
    //NO LA ESTAMOS UTILIZANDO PORQUE NO HAY SUBNODOS
    private static Element obtenerSubelemento(String tag, Element element) {
        return (Element) element.getElementsByTagName(tag).item(0);
    }

    /**
     * Obtener el valor (#PCDATA) de un elemento del Ã¡rbol XML usando una expresiÃ³n XPath
     *
     * @param path    La ruta relativa del elemento
     * @param element Nodo de partida
     * @return Texto recuperado
     */
    private static String obtenerValorXPath(String path, Element element) {

        // REF: Obtener un valor XPath: https://stackoverflow.com/a/6539024

        XPath xPath = XPathFactory.newInstance().newXPath();

        String valor = null;

        try {
            NodeList nodes = (NodeList) xPath.evaluate(path, element, XPathConstants.NODESET);
            if (nodes.getLength() > 0) {
                Node node = nodes.item(0).getChildNodes().item(0);
                valor = node.getNodeValue();
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        return valor;
    }
}
