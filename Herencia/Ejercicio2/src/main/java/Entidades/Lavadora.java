package Entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    private Double carga;

    public Lavadora() {
    }

    public Lavadora(String color, Double precio, Double peso, char consumo, Double carga) {
        super(color, precio, peso, consumo);
        this.carga = carga;
        super.comprobarConsumoEnergetico(this.consumo);
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", peso=" + peso +
                ", consumo=" + consumo +
                '}';
    }

    public void crearLavadora() {
        Scanner sc = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.print("Carga: ");
        this.carga = sc.nextDouble();
    }

    public String precioFinal() {
        super.precioFinal();
        if (carga > 30d) {
            precio += 500;
        }
        String precioFinal = "Precio Lavadora: $" + String.valueOf(precio);
        return precioFinal;
    }
}
