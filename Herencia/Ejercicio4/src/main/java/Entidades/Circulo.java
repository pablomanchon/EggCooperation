package Entidades;

import Interfaces.calculosFormas;

public class Circulo implements calculosFormas {
    private Double area, perimetro, radio, diametro;

    public Circulo() {
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
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
        this.area = PI * Math.pow(this.radio, 2);
        return this.area;
    }

    @Override
    public Double calcularPerimetro(Double PI) {
        this.perimetro = PI * this.diametro;
        return this.perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "area=" + area +
                ", perimetro=" + perimetro +
                ", radio=" + radio +
                ", diametro=" + diametro +
                '}';
    }
}
