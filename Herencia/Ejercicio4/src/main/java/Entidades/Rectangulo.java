package Entidades;

import Interfaces.calculosFormas;

public class Rectangulo implements calculosFormas {
    private Double area, perimetro, base, altura;

    public Rectangulo() {
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public Double calcularArea(Double PI) {
        this.area = this.base * this.altura;
        return this.area;
    }

    @Override
    public Double calcularPerimetro(Double PI) {
        this.perimetro = (this.base + this.altura) * 2;
        return this.perimetro;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "area=" + area +
                ", perimetro=" + perimetro +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
