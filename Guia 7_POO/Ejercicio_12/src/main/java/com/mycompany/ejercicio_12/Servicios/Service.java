/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_12.Servicios;

import com.mycompany.ejercicio_12.Atributos.Persona;
import java.util.*;

/**
 *
 * @author crowl
 */
public class Service {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        
        Persona one=new Persona();
        int dia, anio, mes;
        System.out.println("Ingrese el nombre de la persona");
        one.setNombre(leer.next());
        System.out.println("Ingrese fecha de nacimiento");
        System.out.println("Dia");
        dia=leer.nextInt();
        System.out.println("Mes");
        mes=leer.nextInt();
        System.out.println("Año");
        anio=leer.nextInt();
        Date fecha=new Date(anio-1900,mes-1,dia);
        one.setFecha(fecha);
        return one;
    }
    public int calcularEdad(Persona one){
        Date fechaAc=new Date();
        int edad=(int) ((fechaAc.getTime()-one.getFecha().getTime())/1000/60/60);
        one.setEdad(edad);
        return edad;
    }
    public boolean menorQue(Persona one){
        boolean flag=false;
        System.out.println("Ingrese la edad del receptor");
        int otraEdad=leer.nextInt();
        if (otraEdad<one.getEdad()){
            flag=true;
        }
        return flag;
    }
    public void mostrarPersona(Persona one){
        System.out.println("Nombre: "+one.getNombre());
        System.out.println("Fecha de Nacimiento: "+one.getFecha());
        System.out.println("Edad: "+one.getEdad());
    }
    
}
