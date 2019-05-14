/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class Ejercicio9Validaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dni = JOptionPane.showInputDialog("Introduce el dni" + "\n"
                + "La letra debe de estar en mayúscula");
        Pattern pat = Pattern.compile("^[0-9]{8}[A-Z]");
        Matcher mat = pat.matcher(dni);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El dni introducido es correcto");
            
        }else
            JOptionPane.showMessageDialog(null, "El dni introducido es incorrecto");
    }
    
}
