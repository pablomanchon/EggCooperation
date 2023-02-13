package Entidades;

import java.util.Scanner;

public abstract class Barco {
    protected String matricula;
    protected Double eslora;
    protected String anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, Double eslora, String anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion='" + anioFabricacion + '\'' +
                '}';
    }

    protected Barco crearBarco() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Matricula: ");
        this.matricula = sc.next();

        System.out.print("Eslora: ");
        this.eslora = sc.nextDouble();

        System.out.print("Año: ");
        this.anioFabricacion = sc.next();
        return null;
    }

    public Double modulo() {
        return this.eslora * 10;
    }
}


