package Entidades;

public class Pelicula {

    private String nombre, duracion, director;
    private int edadMinima;

    public Pelicula() {
    }

    public Pelicula(String nombre, String duracion, String director, int edadMinima) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.director = director;
        this.edadMinima = edadMinima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre + ": duracion: " + duracion + " Edad Minima: " + edadMinima;
    }

}
