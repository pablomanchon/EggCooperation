package Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {
    private Double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(String color, Double precio, Double peso, char consumo, Double resolucion, boolean sintonizadorTDT) {
        super(color, precio, peso, consumo);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
        super.comprobarConsumoEnergetico(this.consumo);
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "resolucion=" + resolucion +
                ", sintonizadorTDT=" + sintonizadorTDT +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", peso=" + peso +
                ", consumo=" + consumo +
                '}';
    }

    public void crearTelevisor() {
        Scanner sc = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.print("Reolucion: ");
        this.resolucion = sc.nextDouble();
        System.out.println("TDT (S/N)");
        String tdt;
        do {
            tdt = sc.next().toUpperCase();
            switch (tdt) {
                case "S" -> this.sintonizadorTDT = true;
                case "N" -> this.sintonizadorTDT = false;
                default -> System.out.println("Opcion incorrecta");
            }
        } while (!tdt.equals("S") && !tdt.equals("N"));
    }

    public String precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40d) {
            precio += (precio * 0.3d);
        }
        if (this.sintonizadorTDT) {
            precio += 500;
        }
        String precioFinal = "Precio televisor: $" + String.valueOf(precio);
        return precioFinal;
    }
}
