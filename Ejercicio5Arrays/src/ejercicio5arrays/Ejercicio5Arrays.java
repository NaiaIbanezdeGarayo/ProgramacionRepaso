/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class Ejercicio5Arrays {

     
    
    public static void main(String[] args) {
    
        int [] array1 = {1, 2, 3};
        int [] array2 = {4, 5, 6};
        int [] array3 = {1, 2, 3};
        
        String menu = JOptionPane.showInputDialog("Introduce el número de la opción que quieras elegir.\n"+
                                                   "1. Comparar 2 arrays"+"\n"+
                                                   "2. Ordenar el Array que quieras"+"\n"+
                                                   "3. Convertir a String"+"\n"+
                                                   "4. Convertir a ArrayList"+"\n"+
                                                   "5. Establecer a un Array un valor para todas las posiciones");
        switch(menu){
            
            case "1": comparar(array1,array2,array3);
                break;
            case "2": ordenar();
                break;
            case "3": convertirString();
                break;
            case "4": convertirArrayList();
                break; 
            case "5": convertirAUnMismoValor();
                break;
            case "6": salir();
                break;
                default:
        }
    }

   
    private static void comparar(int [] array1, int [] array2, int [] array3) {
    
        for (int i = 0; i < 10; i++) {
            
        }
    }
    private static void ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void convertirString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void convertirArrayList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void convertirAUnMismoValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     private static void salir() {
        System.exit(0);
    }

    
    
}
