package Entidades;

import java.util.Scanner;

public class Persona {
    protected String nombre, apellidos, estadoCivil;
    protected Integer numIdentificacion;

    public Persona() {
        crearPersona();
    }

    public Persona(String nombre, String apellidos, String estadoCivil, Integer numIdentificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estadoCivil = estadoCivil;
        this.numIdentificacion = numIdentificacion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Integer getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(Integer numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    protected Scanner sc = new Scanner(System.in).useDelimiter("\n");

    protected void crearPersona() {
        System.out.print("Nombre: ");
        this.nombre = sc.next();

        System.out.print("Apellidos: ");
        this.apellidos = sc.next();

        System.out.print("D.N.I: ");
        this.numIdentificacion = sc.nextInt();


        System.out.print("Estado Civil: ");
        this.estadoCivil = sc.next();
    }

    public void cambioEstadoCivil() {
        System.out.println("Ingrese su nuevo estado civil");
        this.estadoCivil = sc.next();
    }
}
