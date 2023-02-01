package Servicios;

import Entidades.Cine;
import Entidades.Pelicula;
import Entidades.Persona;
import Entidades.Sala;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Control {

    Cine cine = new Cine();
    ArrayList<Persona> espectadores = new ArrayList();

    public void generarEspectadores() {
        Persona[] personas = new Persona[5];

        personas[0] = new Persona("Andres", 14, 2000);
        personas[1] = new Persona("Pablo", 80, 500);
        personas[2] = new Persona("Lihuen", 25, 10000);
        personas[3] = new Persona("Jorge", 18, 1000);
        personas[4] = new Persona("Julian", 65, 1000);

        espectadores.addAll(Arrays.asList(personas));
    }

    public void ingresoEspectadores() {
        int opcion;
        boolean pasó;
        for (Persona p : espectadores) {
            System.out.println("Hola " + p.getNombre()
                    + "\n ¿Qué pelicula desea ver?"
                    + "\n Peliculas: ");
            cine.mostrarPeliculas();
            do {
                pasó = false;
                opcion = p.elegirPelicula();
                if (cine.controlPelicula(p, opcion)) {
                    System.out.println("Pase...");
                    pasó = true;
                }
            } while (continuar());
            if (pasó) {
               Sala sala = cine.getSalas().get(opcion-1);
               sala.llenarAsientos();
            }
        }
    }

    Scanner sc = new Scanner(System.in);

    private boolean continuar() {
        System.out.println("Desea escoger otra pelicula?(S/N)");
        do {
            String opcion = sc.next().toUpperCase();
            switch (opcion) {
                case "S" -> {
                    return true;
                }
                case "N" -> {
                    System.out.println("Adiós");
                    return false;
                }
                default ->
                    System.out.println("Opción incorrecta");
            }
        } while (true);
    }
}
