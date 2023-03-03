/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_12;

import com.mycompany.ejercicio_12.Atributos.Persona;
import com.mycompany.ejercicio_12.Servicios.Service;

/**
 *
 * @author crowl
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        Service srv=new Service();
        Persona per=srv.crearPersona();
        System.out.println(""+srv.calcularEdad(per));
        System.out.println(""+srv.menorQue(per));
        System.out.println("VAMOS A MOSTRAR LOS DATOS CARGADOS");
        srv.mostrarPersona(per);
    }
}
