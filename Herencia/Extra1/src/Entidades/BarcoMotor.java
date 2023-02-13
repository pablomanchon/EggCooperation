package Entidades;

import java.util.Scanner;

public class BarcoMotor extends Barco {
    protected Integer pCV;

    public BarcoMotor() {
        crearBarco();
    }

    public BarcoMotor(String matricula, Double eslora, String anioFabricacion, Integer pCV) {
        super(matricula, eslora, anioFabricacion);
        this.pCV = pCV;
    }

    public Integer getpCV() {
        return pCV;
    }

    public void setpCV(Integer pCV) {
        this.pCV = pCV;
    }

    @Override
    public Barco crearBarco() {
        Scanner sc = new Scanner(System.in);
        super.crearBarco();

        System.out.print("pCV: ");
        this.pCV = sc.nextInt();

        return this;
    }

    @Override
    public Double modulo(){
        return super.modulo()+this.pCV;
    }
}
