/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_12.Atributos;

import java.util.Date;

/**
 *
 * @author crowl
 */
public class Persona {
    private String nombre;
    private Date fecha;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
