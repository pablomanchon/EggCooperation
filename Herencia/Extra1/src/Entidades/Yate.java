package Entidades;

import java.util.Scanner;

public final class Yate extends BarcoMotor {
    private int numeroCamarotes;

    public Yate() {
        crearBarco();
    }

    public Yate(String matricula, Double eslora, String anioFabricacion, Integer pCV, int numeroCamarotes) {
        super(matricula, eslora, anioFabricacion, pCV);
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "numeroCamarotes=" + numeroCamarotes +
                ", pCV=" + pCV +
                ", matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion='" + anioFabricacion + '\'' +
                '}';
    }

    @Override
    public Barco crearBarco() {
        Scanner sc = new Scanner(System.in);
        super.crearBarco();
        System.out.print("Numero de camarotes: ");
        this.numeroCamarotes = sc.nextInt();
        return this;
    }
    @Override
    public Double modulo(){
        return super.modulo()+this.numeroCamarotes;
    }
}
