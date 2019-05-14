/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class Ejercicio10Validaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String regex = "[A-Za-z]+@[a-z]+\\.[a-z]+";
        //String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-+])*(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
        String cadena = JOptionPane.showInputDialog("Introduce tu email");
        Pattern pat = Pattern.compile("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z]+(\\.[a-z])*(\\.[a-z]+)*(\\.[a-z]{2,4})$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El email es correcto");
        }else
            JOptionPane.showMessageDialog(null, "El email es incorrecto");
    }
    
}
