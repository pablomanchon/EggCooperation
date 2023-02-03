package Entidades;

import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private double dinero;
    private String asiento;

    public Persona() {
    }

    public Persona(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + ", asiento=" + asiento + '}';
    }

   

    public int elegirPelicula() {
        Scanner sc = new Scanner(System.in);
        do {
            int opcion = sc.nextInt();
            if (opcion > 0 && opcion < 6) {
                return opcion;
            } else {
                System.out.println("Opción incorrecta, vuelva a ingresar");
            }
        } while (true);
    }
}
