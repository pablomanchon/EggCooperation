package Main;

import Entidades.Electrodomestico;
import Logica.Controlador;

import java.util.ArrayList;
import java.util.Arrays;

/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
        La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
        Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
        mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
        siguiente:*/
public class Main {
    public static void main(String[] args) {
        Controlador c = new Controlador();
        ArrayList<Electrodomestico> electrodomesticos;
        electrodomesticos = c.electrodomesticosPorDefecto();
        for(Electrodomestico aux : electrodomesticos){
            System.out.println(aux);
        }
        c.verPrecios(electrodomesticos);
        c.precioTelevisores(electrodomesticos);
        c.precioLavadoras(electrodomesticos);
        c.precioElectrodomesticos(electrodomesticos);
    }
}