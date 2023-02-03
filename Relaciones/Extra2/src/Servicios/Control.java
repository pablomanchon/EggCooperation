package Servicios;

import Entidades.Cine;
import Entidades.Persona;
import Entidades.Sala;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Control {

    Cine cine = new Cine();
    ArrayList<Persona> espectadores = new ArrayList();

    public void generarEspectadores() {
        Persona[] personas = new Persona[50];

        for (int i = 0; i < 50; i++) {
            personas[i] = new Persona(("Nombre " + i), 20, 1000);
        }
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
                    pasó = true;
                }
            } while (continuar());
            if (pasó) {
                System.out.println("Pase...");
                Sala sala = cine.getSalas().get(opcion - 1);
                p.setAsiento(sala.darAsiento());
            }
        }
        for (Persona p : espectadores) {
            System.out.println(p);
        }
    }

    public void mostrarAsientos() {
        cine.getSalas().get(0).mostrarAsientos();
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
