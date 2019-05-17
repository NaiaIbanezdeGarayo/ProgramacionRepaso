/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14clases;

/**
 *
 * @author Naia
 */
class Persona {

    private String dni;
    private String apellido;
    private String nombre;
    private String sexo;
    private int edad;
    private int peso;

    public Persona() {
    }

    public Persona(String dni, String apellido, String nombre, String sexo, int edad, int peso) {
        this.dni = dni;
        this.apellido = apellido;
        
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return   dni + "   " + apellido +  ",   " + nombre + "   " + sexo + "   " + edad + "   " + peso ;
    }
    
    
}
