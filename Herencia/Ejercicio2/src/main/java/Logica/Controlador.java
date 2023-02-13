package Logica;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Controlador {
    Lavadora lavadora = new Lavadora();
    Televisor televisor = new Televisor();

    public void crearElectrodomesticos() {
        lavadora.crearLavadora();
        televisor.crearTelevisor();
    }

    public ArrayList<Electrodomestico> electrodomesticosPorDefecto() {
        ArrayList<Electrodomestico> e = new ArrayList();
        e.add(new Lavadora("Rojo", 1000d, 20d, 'F', 3d));
        e.add(new Lavadora("Blanco", 1000d, 80d, 'A', 5d));
        e.add(new Televisor("Azul", 1000d, 50d, 'F', 40d, true));
        e.add(new Televisor("Marron", 1000d, 30d, 'F', 60d, true));
        return e;
    }

    public void verPrecios(ArrayList<Electrodomestico> e) {
        for (Electrodomestico aux : e) {
            System.out.println(aux.precioFinal());
        }
    }

    public void precioTelevisores(ArrayList<Electrodomestico> e) {
        Double precioTeles = 0d;
        for (Electrodomestico aux : e) {
            if (String.valueOf(aux.getClass()).contains("Televisor")) {
                precioTeles += aux.getPrecio();
            }
        }
        System.out.println("Precio de los televisores: $" + precioTeles);
    }

    public void precioLavadoras(ArrayList<Electrodomestico> e) {
        Double precioLavadoras = 0d;
        for (Electrodomestico aux : e) {
            if (String.valueOf(aux.getClass()).contains("Lavadora")) {
                precioLavadoras += aux.getPrecio();
            }
        }
        System.out.println("Precio de las lavadoras: $" + precioLavadoras);
    }

    public void precioElectrodomesticos(ArrayList<Electrodomestico> e) {
        Double precioTodo = 0d;
        for (Electrodomestico aux : e) {
            precioTodo += aux.getPrecio();
        }
        System.out.println("Precio de Todo es: $" + precioTodo);
    }
}
