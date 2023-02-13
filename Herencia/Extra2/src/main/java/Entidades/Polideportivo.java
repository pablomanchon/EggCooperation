package Entidades;

public class Polideportivo extends Edificio{
    private String nombre, tipoInstalacion;
    private boolean techo;

    public Polideportivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    public boolean isTecho() {
        return techo;
    }

    public void setTecho(boolean techo) {
        this.techo = techo;
    }

    @Override
    public String toString() {
        return "Polideportivo{" +
                "nombre='" + nombre + '\'' +
                ", tipoInstalacion='" + tipoInstalacion + '\'' +
                ", techo=" + techo +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", largo=" + largo +
                '}';
    }

    @Override
    public Double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public Double calcularVolumen() {
        return ancho * largo * alto;
    }
}
