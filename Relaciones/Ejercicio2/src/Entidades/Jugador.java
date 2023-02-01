package Entidades;

public class Jugador {

    private String ID;
    private String nombre;
    private boolean mojado = false;

    public Jugador() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID=" + ID + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    //Metodos
    public boolean Disparo(Revolver r) {
        if (r.mojar()) {
            this.mojado = true;
        }
        r.siguienteChorro();
        return mojado;
    }
}
