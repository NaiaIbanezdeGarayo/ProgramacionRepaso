/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class Ejercicio4Arrays {

    static double [] notasAlumnos = new double[10];
    static String [] nombresAlumnos = new String[4];
    static String [] notas = new String [4];
    
    public static void main(String[] args) {
            
            String notaFinal = " ";
       
        for (int i = 0; i < nombresAlumnos.length; i++) {
            
            String [] notas = {"Suspenso","Bien","Notable","Sobresaliente"};
            
            
            String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno");
            nombresAlumnos [i] = nombre;
            JOptionPane.showMessageDialog(null, "El nombre se ha añadido correctamente");
            
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de  " + nombre));
            notasAlumnos [i] = nota;
            JOptionPane.showMessageDialog(null, "La nota se ha añadido perfectamente");
            
           String  calificacion = " " ;
                    
            if (nota>=0 && nota<5) {
                    calificacion = notas [0];
            }
            if (nota>=5 && nota<7) {
                   calificacion = notas [1];
            }
            if (nota>=7 && nota<9) {
                    
                    calificacion = notas [2];
            }
            if (nota>=9 && nota<10) {
                    
                    calificacion = notas [3];
            }
                
            notaFinal = notaFinal + nombresAlumnos[i] + ": " + calificacion + "\n" ;
        }
        
        JOptionPane.showMessageDialog(null, notaFinal);
        
    }
    
}
