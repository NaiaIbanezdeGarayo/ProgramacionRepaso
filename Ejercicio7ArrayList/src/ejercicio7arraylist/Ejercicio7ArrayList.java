/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class Ejercicio7ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        int continuar ;
        do {
            int numeros = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número")); 
            listaNumeros.add(numeros);
            continuar = JOptionPane.showConfirmDialog(null,"Quieres continuar introduciendo números?");
        }
        while (continuar==0);
        
        menu = JOptionPane.showInputDialog("Introduce el número de la opción que deseas:\n"
                                            + "1. Agregar un número.\n"
                                            + "2. Buscar un número.\n"
                                            + "3. ");
    }
    
}
