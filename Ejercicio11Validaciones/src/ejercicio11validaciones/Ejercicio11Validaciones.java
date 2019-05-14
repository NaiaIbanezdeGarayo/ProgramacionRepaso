/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11validaciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class Ejercicio11Validaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    String fechaNumerica = JOptionPane.showInputDialog("Introduce una fecha númerica"+ "\n"
                                                        + "Formato: DD/MM/YYYY");
    //LocalDate fechaNumeros = LocalDate.parse(fechaNumerica, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
       
    Pattern pat= Pattern.compile("^([012][0-9]|3[01])(\\/)(0[1-9]|1[012])\\2(\\d{4})$");
    Matcher mat = pat.matcher(fechaNumerica);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "La fecha introducida es correcta");
        }else
            JOptionPane.showMessageDialog(null, "La fecha introducida es incorrecta");
    }
    
}
