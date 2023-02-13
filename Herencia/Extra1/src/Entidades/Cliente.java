package Entidades;

import java.time.LocalDate;

public final class Cliente {
    private String nombre;
    private String documento;
    private LocalDate fechaInicio;
    private LocalDate fechaEntrega;
    private Integer posicionAmarre;
    private Barco barco;

    public Cliente() {
    }

    public Cliente(String nombre, String documento, LocalDate fechaInicio, LocalDate fechaEntrega, Integer posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaEntrega=" + fechaEntrega +
                ", posicionAmarre=" + posicionAmarre +
                ", barco=" + barco +
                '}';
    }
}
