/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1arrays;


import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class Ejercicio1Arrays {

    //Array de 10 posiciones
            static int [] listaNumeros = new int [9];
            
            
    public static void main(String[] args) {
    
        
        JOptionPane.showMessageDialog(null,"Teclea los números que quieras en los siguientes posiciones indicadas.");
        
        
            
        //Repetitiva hasta que se rellene el array
        for (int i = 0; i < listaNumeros.length; i++) {
            
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número en esta posición " + i));
            listaNumeros[i] = numero;
            System.out.println(listaNumeros[i]);//Para mostrar por consola los datos creados.
        }
        
        //Menú
        String listaMenu = JOptionPane.showInputDialog("1. Mostrar el contenido de todas las posiciones." + "\n" +
                                                       "2. Mostrar el contenido de una posición concreta." + "\n" +
                                                       "3. Modificar el contenido de una posición concreta." + "\n" +
                                                       "4. Vaciar el contenido de una posición concreta." + "\n" +
                                                       "5. Calcular la suma y la media de todos los nÃºmeros." + "\n" +
                                                       "6. Ordenar los número de mayot a menor." + "\n" +
                                                       "7. Salir." + "\n" +
                                                       "Introduce el número de la opción que quieras hacer:");
        switch(listaMenu){
            case "1": mostrarTodasPosiciones();
            break;
            case "2": mostrarPosicionConcreta();
            break;
            case "3": modificarPosicionConcreta();
            break;
            case "4": vaciarPosicionConcreta();
            break;
            case "5": calcularSumaMedia();
            break;
            case "6": ordenarMayorMenor();
            break;
            case "7": salir();
            break;
            default: JOptionPane.showMessageDialog(null, "Escribe bien el nÃºmero.");
        
        }
       
                   
    }

    private static void mostrarTodasPosiciones() {
        //Mostrar el contenido de todas las posiciones.
        String contenido = "";
        for (int i = 0; i < listaNumeros.length; i++) {
            
            contenido = contenido + "  " + listaNumeros[i];
        }
        
        JOptionPane.showMessageDialog(null,"Contenido de todas las posiciones:" + "\n" + contenido );
    }

    private static void mostrarPosicionConcreta() {
        //Mostrar el contenido de una posiciÃ³n concreta.
        int  posicion = Integer.parseInt(JOptionPane.showInputDialog("Teclea del 1 al 10 la posición que quieras obtener."));
        
        //Como hemos puesto del 1 al 10 y las posiciones en el Array empiezan desde el 0 le vamos a quitar un 1.
        posicion = posicion - 1;
        
        JOptionPane.showMessageDialog(null, listaNumeros[posicion]);
        
    }

    private static void modificarPosicionConcreta() {
       //Modificar el contenido de una posiciÃ³n concreta.
       int  posicion = Integer.parseInt(JOptionPane.showInputDialog("Teclea del 1 al 10 la posición que quieras modificar."));
       int numeroNuevo = Integer.parseInt(JOptionPane.showInputDialog("Porque número quieres modificar este: " + " " + listaNumeros[posicion])); 
       //Como hemos puesto del 1 al 10 y las posiciones en el Array empiezan desde el 0 le vamos a quitar un 1.
       posicion = posicion - 1;
       listaNumeros[posicion] = numeroNuevo;
       
       JOptionPane.showMessageDialog(null, "Número cambiado: " + numeroNuevo );
       
    }

    private static void vaciarPosicionConcreta() {
       //Vaciar el contenido de una posición concreta.
       int  posicion = Integer.parseInt(JOptionPane.showInputDialog("Teclea del 1 al 10 la posición que quieras modificar."));
       int numeroNuevo = Integer.parseInt(JOptionPane.showInputDialog("Porque número quieres modificar este: " + " " + listaNumeros[posicion])); 
       //Como hemos puesto del 1 al 10 y las posiciones en el Array empiezan desde el 0 le vamos a quitar un 1.
       posicion = posicion - 1;
       listaNumeros[posicion] = 0;
              
       JOptionPane.showMessageDialog(null, "Número borrado." );
    }

    private static void calcularSumaMedia() {
       //Calcular la suma y la media de todos los números.
       int suma = 0; 
        for (int i = 0; i < listaNumeros.length; i++) {
            suma += listaNumeros[i];
        }
       float media = suma/listaNumeros.length;
       
       JOptionPane.showMessageDialog(null,"Suma: " + suma + "\n" +
                                           "Media: " + media);
        
    }

    private static void ordenarMayorMenor() {
       //Ordenar los números de mayor a menor.
        //MÃ©todo burbuja
        for (int x = 0; x < listaNumeros.length; x++) {
        for (int i = 0; i < listaNumeros.length-x-1; i++) {
            if(listaNumeros[i] < listaNumeros[i+1]){
                int tmp = listaNumeros[i+1];
                listaNumeros[i+1] = listaNumeros[i];
                listaNumeros[i] = tmp;
            }
        }
    }
       
       comprobarLista();
       
    }

    private static void salir() {
        //Salir
        System.exit(0);
    }

    private static void comprobarLista() {
      String contenido = "";
        for (int i = 0; i < listaNumeros.length; i++) {
            
            contenido = contenido + "  " + listaNumeros[i];
        }
        
        JOptionPane.showMessageDialog(null,"Contenido de todas las posiciones:" + "\n" + contenido );  
    }
    
}