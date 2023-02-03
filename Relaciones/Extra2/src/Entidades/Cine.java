package Entidades;

import java.util.ArrayList;
import java.util.Arrays;

public final class Cine {

    private ArrayList<Sala> salas = new ArrayList();
    private ArrayList<Pelicula> peliculas = new ArrayList<>();
    private final double precio;

    public Cine() {
        this.precio = 1000;
        for(int i = 0; i < 5 ; i++){
            importarSalas();
        }
        importarPeliculas();
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "salas: " + salas + ", peliculas: " + peliculas;
    }

    public void importarPeliculas() {
        Pelicula[] peli = new Pelicula[5];

        peli[0] = new Pelicula("Shrek", "2:30hs", "DreamWorks", 13);
        peli[1] = new Pelicula("El Origen", "3:00hs", "Juan Pepe", 18);
        peli[2] = new Pelicula("Los Simpsons", "2:00hs", "Ricardo Mollo", 10);
        peli[3] = new Pelicula("Titanic", "4:00hs", "Maddona", 15);
        peli[4] = new Pelicula("El Señor de los Anillos", "4:00hs", "Julian Camilo Velasco", 18);

        for (int i = 0; i < 5; i++) {
            salas.get(i).
                    setPelicula(peli[i]);
        }

        peliculas.addAll(Arrays.asList(peli));
    }

    private void importarSalas() {
        this.salas.add(new Sala());
    }

    public void mostrarPeliculas() {
        int i = 1;
        for (Pelicula p : peliculas) {
            System.out.println("(" + (i++) + ")" + p);
        }
    }

    public boolean controlPelicula(Persona p, int opcion) {
        Pelicula pelicula = this.peliculas.get(opcion - 1);
        
        if (p.getEdad() < pelicula.getEdadMinima()) {
            System.out.println("No tiene la edad necesaria");
            return false;

        } else if (p.getDinero() < this.precio) {
            System.out.println("No tiene dinero necesario, pidale a lihuen");
            return false;

        } else {
            return true;
        }
    }

}
