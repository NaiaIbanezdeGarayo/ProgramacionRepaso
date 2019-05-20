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

    static ArrayList<Persona>personas;
    static int continuar;
    
    public static void main(String[] args) {
        
    
    
        
        personas = new ArrayList<Persona>();
        
        do {
            Persona p = new Persona();
            
            //DNI
            String dni = JOptionPane.showInputDialog("Introduce DNI");
            Pattern pa = Pattern.compile("^[0-9]{8}[A-Z]");
            Matcher ma = pa.matcher(dni);
                if (ma.matches()) {
                    JOptionPane.showMessageDialog(null, "DNI introducido");
            
                }
            
            p.setDni(dni);
            
            
            //APELLIDO
            String apellido = JOptionPane.showInputDialog("Introduce el apellido");
            Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
            Matcher m = pattern.matcher(apellido);
                if (m.matches()) {
                    JOptionPane.showMessageDialog(null, "Apellido introducido");
            }
            p.setApellido(apellido); 
            
            
            //NOMBRE
            String nombre = JOptionPane.showInputDialog("Introduce el nombre");
            Pattern patt = Pattern.compile("^[A-Z][a-z]{2,}");
            Matcher matt = patt.matcher(nombre);
            if (matt.matches()) {
                JOptionPane.showMessageDialog(null, "Nombre introducido");
            }
            p.setNombre(nombre);
            
            
            //SEXO
            String sexo = JOptionPane.showInputDialog("Introduce el sexo,\n"
                                                        + "Al introducir el texto deberas poner H o M u O");
            Pattern pat = Pattern.compile("H|M|O");
            Matcher mat = pat.matcher(sexo);
            if (mat.matches()) {
                JOptionPane.showMessageDialog(null, "Sexo introducido");
            }
            p.setSexo(sexo);
            
            
            //EDAD
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Intorduce la edad"));
            p.setEdad(edad);
            
            
            //PESO
            int peso = Integer.parseInt(JOptionPane.showInputDialog("Introdue el peso"));
            p.setPeso(peso);
            
            personas.add(p);
            
            continuar = JOptionPane.showConfirmDialog(null, "Quieres seguir introduciendo personas?");
        } while (continuar==0);
        
    
        
        
        
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
}   

