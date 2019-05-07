/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class Ejercicio3Arrays {

    
    public static void main(String[] args) {
        char [] abecedario = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String pos = "";
        int posicion;
        do {
            posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce de 1 en 1 la posicion que quieres obtener:\n"+
                                    "A     B     C     D     E     F     G     H     I     J     K     L     M      N \n"+
                                    "0     1     2     3     4     5     6     7     8     9     10    11    12     13 \n"+"\n"+
                                    "Ñ      O       P       Q       R       S       T        U       V       W       X      Y        Z\n"+
                                    "14    15     16     17     18     19     20     21      22      23     24     25     26"+"\n"+
                                    "Introduce -1 si quieres acabar"));
             
            if (posicion>=0 && posicion<=26) {
               pos += abecedario[posicion] + " ";
               JOptionPane.showMessageDialog(null,"Se ha guardado correctamente el caracter."); 
            }
 
             
        } 
        while (posicion != -1);
        
        JOptionPane.showMessageDialog(null, "Esta es la cadena de caracteres obtenida: \n" + pos);      
        
        
            
        
        
        
       
    
    
    } 
    
}
