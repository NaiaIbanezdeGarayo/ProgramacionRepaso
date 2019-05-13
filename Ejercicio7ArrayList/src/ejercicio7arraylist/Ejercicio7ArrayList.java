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

    static ArrayList<Integer> listaNumeros ;
    public static void main(String[] args) {
       
        listaNumeros = new ArrayList<Integer>();
        int continuar ;
        do {
            int numeros = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número")); 
            listaNumeros.add(numeros);
            continuar = JOptionPane.showConfirmDialog(null,"Quieres continuar introduciendo números?");
        }
        while (continuar==0);
        
        String menu = JOptionPane.showInputDialog("Introduce el número de la opción que deseas:\n"
                                            + "1. Agregar un número.\n"
                                            + "2. Buscar un número.\n"
                                            + "3. Modificar un número.\n"
                                            + "4. Eliminar un número.\n"
                                            + "5. Insertar un número en una posición concreta.");
        switch(menu){
            case "1": agregarNumero(); 
                break;
            case "2": buscarNumero();
                break;
            case "3": modificarNumero();
                break;
            case "4": eliminarNumero();
                break;
            case "5": insertarNumeroEnPosicion();
                break;
        
        }
    }

    private static void agregarNumero() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número que quieres añadir"));
        listaNumeros.add(numero);
    }

    private static void buscarNumero() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número que quieres buscar"));
        boolean buscar = listaNumeros.contains(numero);
        if ( buscar == true) {
            JOptionPane.showMessageDialog(null, "El número introducido ha sido encontrado " + numero);
        }
        else
            JOptionPane.showMessageDialog(null, "El número introducido no ha sido introducido");
    }

    private static void modificarNumero() {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion que quieres modificar"));
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce por el número que quieres cambiar"));
        
        listaNumeros.set(posicion, numero);
    }

    private static void eliminarNumero() {
        String cadena =" ";
        for (int i = 0; i < listaNumeros.size(); i++) {
            int numero = listaNumeros.get(i);
            cadena= cadena + numero + " ";
        }
            
        
        int posicion  = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion que quieres borrar" + "\n"+cadena));
        listaNumeros.remove(posicion);
        
        for (int i = 0; i < listaNumeros.size(); i++) {
            int numero = listaNumeros.get(i);
            cadena= cadena + numero + " ";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }

    private static void insertarNumeroEnPosicion() {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion que quieres insertar el numero"));
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número que quieres insertar"));
        
        listaNumeros.add(posicion, numero);
    }

    

    
}
