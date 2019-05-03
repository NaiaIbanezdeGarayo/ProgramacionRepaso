/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2arrays;


import java.net.ContentHandlerFactory;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class Ejercicio2Arrays {
    static int [] listaNumerosNuevos = new int [10];
    
    static int [] listaNumerosAleatorios;
    public static void main(String[] args) {
        // Primero preguntamos de que tamaño quiere el usuario que sea el Array.
         int tamañoArray= Integer.parseInt(JOptionPane.showInputDialog("Indica de que tamaño quieres que sea el Array"));
          listaNumerosAleatorios= new int[tamañoArray];
         
         //Vamos rellenando el array metiendo números aleatorios.
         for (int i = 0; i < listaNumerosAleatorios.length; i++) {
             
             int numeroAleatorio = (int) (Math.random() * 300) + 1;
             listaNumerosAleatorios [i] = numeroAleatorio;
             System.out.println(listaNumerosAleatorios[i]);
        }
        
        int numeroFinal= Integer.parseInt(JOptionPane.showInputDialog("En que número quieres que acaben los número que quieres obtener?"));
        
        int j;
        int k=0;
        int contador=0;
        boolean encontrado = false;
        for (int i = 0; i < listaNumerosAleatorios.length; i++) {
            for (j = numeroFinal; j < 300; j+=10) {
                if (j == listaNumerosAleatorios[i]) {
                    listaNumerosNuevos[k] = listaNumerosAleatorios[i];
                    k++;
                    contador++;
                    encontrado=true;
                }
                else
                    encontrado = false;
            }
            
        }
        String cadena = " ";
        for (int i = 0; i < contador; i++) {
            cadena += listaNumerosNuevos[i] + "  ";
            
        }
        
        JOptionPane.showMessageDialog(null, cadena);
    }

    
    
}

