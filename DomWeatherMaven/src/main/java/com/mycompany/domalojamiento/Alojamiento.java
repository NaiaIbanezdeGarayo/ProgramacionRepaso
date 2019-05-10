package com.mycompany.domalojamiento;

import java.time.LocalDate;

/**
 *
 * @author Adrian
 */
public class Alojamiento {
    
    private int id;
    private String nombre;
    private LocalDate fecha;
    private String lugar;
    private String precio = "Gratis";

    public Alojamiento(int id, String nombre, LocalDate fecha, String lugar, String precio) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.precio = precio;
    }

    public Alojamiento() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", lugar=" + lugar + ", precio=" + precio + '}';
    }
    
    
    
    
}
