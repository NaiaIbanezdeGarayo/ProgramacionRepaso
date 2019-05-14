/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class Ejercicio12Validaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre"+"\n"+"Debe empezar el nombre por mayúscula");
        Pattern pat = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher mat = pat.matcher(nombre);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El nombre introducido es correcto");
        }else
            JOptionPane.showMessageDialog(null, "El nombre introducido no es correcto");
    }
    
}
