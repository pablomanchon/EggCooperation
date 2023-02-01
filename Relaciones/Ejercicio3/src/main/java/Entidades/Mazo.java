package Entidades;

import java.util.*;

public class Mazo {
    private LinkedList<Carta> cartas = new LinkedList<>();

    public Mazo() {
    }

    public Mazo(LinkedList<Carta> cartas) {
        this.cartas = cartas;
    }

    public LinkedList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(LinkedList<Carta> cartas) {
        this.cartas = cartas;
    }
    public void barajar() {
        if (!cartasVacias()) {
            System.out.print("Barajando");
            Collections.shuffle(cartas);
        }
    }

    public void siguienteCarta() {
        cartas.addFirst(cartas.getLast());
        cartas.removeLast();
    }

    public void cartasDisponibles() {
        if (!cartasVacias())
            System.out.println(cartas);
    }

    private LinkedList<Carta> mesa = new LinkedList<>();

    public void darCartas() {
        mesa.add(cartas.getFirst());
        cartas.removeFirst();
    }

    public void cartasMonton() {
        if (!cartasVacias())
            System.out.println(mesa);

    }

    public void mostrarBaraja() {
        System.out.println("Cartas en la Mesa: ");
        cartasMonton();
        System.out.println("Cartas en el Mazo: ");
        cartasDisponibles();
    }

    private boolean cartasVacias() {
        if (cartas.isEmpty()) {
            System.out.println("No hay cartas disponibles");
            return true;
        }
        return false;
    }
}
