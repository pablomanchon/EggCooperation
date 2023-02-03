package Entidades;

import Enums.Asientos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Sala {

    ArrayList<ArrayList<String>> asientos = new ArrayList();
    private String letra;
    private Pelicula pelicula;
    private ArrayList<Persona> espectadores = new ArrayList();

    public Sala() {
        crearAsientos();
        mostrarAsientos();
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public ArrayList<Persona> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Persona> espectadores) {
        this.espectadores = espectadores;
    }

    public ArrayList<ArrayList<String>> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<ArrayList<String>> asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Sala{" + "asientos=" + asientos + ", letra=" + letra + ", pelicula=" + pelicula + ", espectadores=" + espectadores + '}';
    }

    private void crearAsientos() {
        for (int i = 0; i < 8; i++) {
            asientos.add(new ArrayList<String>());
        }
        for (int i = 0; i < 8; i++) {
            for (Asientos a : Asientos.values()) {
                String asiento = a.toString() + (i + 1);
                asientos.get(i).add(asiento);
            }
        }
    }

    public String darAsiento() {
        Random rdm = new Random();
        int filas, columnas;
        boolean asientoVacio;
        int cont = 0;
        do {
            filas = rdm.nextInt(8);
            columnas = rdm.nextInt(6);
            System.out.println(filas + " " + columnas);
            if (!asientos.get(filas).get(columnas).contains("X")) {
                asientos.get(filas).set(columnas, asientos.get(filas).get(columnas) + "X");
                asientoVacio = true;
            } else {
                asientoVacio = false;
            }
            cont++;
        } while (!asientoVacio && cont < 48);
        if (!asientoVacio) {
            System.out.println("No hay Lugar");
        }
        return asientoVacio ? asientos.get(filas).get(columnas) : null;
    }

    public void mostrarAsientos() {

        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print("|" + asientos.get(i).get(j) + "|");
            }
            System.out.println();
        }

        System.out.println("_____________________________");
    }
}
