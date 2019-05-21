/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19entornografico;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class Ejercicio19EntornoGrafico {
    static Persona p;
    static ArrayList<Persona>personas;
    static int continuar;
    public static Ventana v;
    
    public static void main(String[] args) {
        personas = new ArrayList<Persona>();
        abrirVentana();
        
        abrirMenu();    
        
        
            
             
    }
    
    static void rellenarDatos(String d, String n, String a, String s,int e, int pe) {
        p = new Persona();
        p.setDni(d);
        p.setNombre(n);
        p.setApellido(a);
        p.setSexo(s);
        p.setEdad(e);
        p.setPeso(pe);
        
        personas.add(p);
        cerrarVentana();
    }

    private static void buscarPersona() {
        String dnip = JOptionPane.showInputDialog("Introduce el dni");
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equals(dnip)) {
            JOptionPane.showMessageDialog(null, "DNI: " + personas.get(i).getDni() + "\n" +
                                                "Apellido: " + personas.get(i).getApellido() + "\n" +
                                                "Nombre: " + personas.get(i).getNombre()+ "\n" +
                                                "Sexo: " + personas.get(i).getSexo()+ "\n" + 
                                                "Edad: " + personas.get(i).getEdad()+"\n" +
                                                "Peso: " + personas.get(i).getPeso());
            }
        }
    }

    private static void eliminarPersona() {
    String dnip = JOptionPane.showInputDialog("Introduce el dni");
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equals(dnip)) {
                personas.remove(i);
            }
        }    
    }

    private static void ordenarApellido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void mostrarLista() {
         String contenido = "";
        for (int i = 0; i < personas.size(); i++) {
            
            contenido = contenido + "  " + personas;
        }
        
        JOptionPane.showMessageDialog(null,"Contenido de todas las posiciones:" + "\n" + contenido );
    }

    private static void salir() {
        System.exit(0);
    
    }

    private static void abrirVentana() {
        v = new Ventana();
        v.setVisible(true);
    }

    static void rellenarDatos(String text, String text0, String text1, Object selectedItem, String text2, String text3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void cerrarVentana() {
        v.setVisible(false);
    }

    private static void abrirMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}   

