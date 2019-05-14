/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class Ejercicio8ArrayList {

    static ArrayList<Integer>listaNumeros;
    public static void main(String[] args) {
    
        listaNumeros = new ArrayList<Integer>();
        do {            
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número que desees para crear el ArrayList"));
            listaNumeros.add(numero);
            int continuar = JOptionPane.showConfirmDialog(null,"¿Quieres continuar introduciendo números?");
        } while (numero != 99);
    }
    
}
