/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class Ejercicio13Validaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "A continuación introduciras tu dirección");
        //Calle
        String calle = JOptionPane.showInputDialog("Introduce la calle");
        Pattern pat = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher mat = pat.matcher(calle);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "La calle es correcta");
        }else
            JOptionPane.showMessageDialog(null, "La calle es incorrecta");
        
        //Numero
        String numero = JOptionPane.showInputDialog("Introduce la calle");
        Pattern patt = Pattern.compile("^[0-9]{1,3}");
        Matcher matc = patt.matcher(numero);
        if (matc.matches()) {
            JOptionPane.showMessageDialog(null, "La calle es correcta");
        }else
            JOptionPane.showMessageDialog(null, "La calle es incorrecta");
        
        
        //Piso
        String piso = JOptionPane.showInputDialog("Introduce la calle");
        Pattern pa = Pattern.compile("^^[0-9]{1,2}");
        Matcher ma = pa.matcher(piso);
        if (ma.matches()) {
            JOptionPane.showMessageDialog(null, "La calle es correcta");
        }else
            JOptionPane.showMessageDialog(null, "La calle es incorrecta");
        
        //Letra
        String letra = JOptionPane.showInputDialog("Introduce la calle");
        Pattern p = Pattern.compile("^^[0-9]{1,2}");
        Matcher m = p.matcher(letra);
        if (m.matches()) {
            JOptionPane.showMessageDialog(null, "La calle es correcta");
        }else
            JOptionPane.showMessageDialog(null, "La calle es incorrecta");
        
        
        
        }
    
    
}
