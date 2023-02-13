package Entidades;

import java.util.Scanner;

public final class Velero extends Barco {
    private int mastiles;

    public Velero() {
        crearBarco();
    }

    public Velero(String matricula, Double eslora, String anioFabricacion, int mastiles) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "mastiles=" + mastiles +
                ", matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion='" + anioFabricacion + '\'' +
                '}';
    }

    @Override
    public Barco crearBarco() {
        Scanner sc = new Scanner(System.in);
        super.crearBarco();

        System.out.print("Número de mástiles: ");
        this.mastiles = sc.nextInt();

        return this;
    }

    @Override
    public Double modulo() {
        return super.modulo() + this.mastiles;
    }
}
