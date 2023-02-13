package Logica;

import Entidades.Circulo;
import Entidades.Rectangulo;

import java.util.Scanner;

public class Control {

    Scanner sc = new Scanner(System.in);

    public void crearCirculo() {
        Circulo circulo = new Circulo();
        System.out.println("__________Creación Circulo__________");

        System.out.print("Radio: ");
        circulo.setRadio(sc.nextDouble());

        System.out.print("Diametro: ");
        circulo.setDiametro(sc.nextDouble());

        circulo.calcularPerimetro(Math.PI);
        circulo.calcularArea(Math.PI);
        System.out.println(circulo);
    }

    public void crearRectangulo() {
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("__________Creacion Rectangulo__________");

        System.out.print("Base: ");
        rectangulo.setBase(sc.nextDouble());

        System.out.print("Altura: ");
        rectangulo.setAltura(sc.nextDouble());

        rectangulo.calcularArea(Math.PI);
        rectangulo.calcularPerimetro(Math.PI);
        System.out.println(rectangulo);
    }
}
