/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios6arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class Ejercicios6ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> caracteres = new ArrayList<String>();
        String cadena = " ";
        
        for (int i = 0; i < 3; i++) {
            
            String valor = JOptionPane.showInputDialog("Introduce un valor");
            caracteres.add(valor);
        }
        
        for (int x = 2 ; x > -1; x--){
        
            String valor =  caracteres.get(x);
            cadena += valor + " "; 
        }
            JOptionPane.showMessageDialog(null, cadena);
          
    }
}
        
     
