package Entidades;

import Enums.EnumPalos;

public class Carta {
    private int numero;
    private String palo;

    public Carta() {
    }

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "numero: " + numero +
                " palo: '" + palo + "\n";
    }

    public Carta cartaBasto(int i) {
        Carta c = new Carta();
        c.numero = (i);
        c.palo = EnumPalos.BASTO.palosBien;
        return c;
    }

    public Carta cartaOro(int i) {
        Carta c = new Carta();
        c.numero = (i);
        c.palo = EnumPalos.ORO.palosBien;
        return c;
    }

    public Carta cartaCopa(int i) {
        Carta c = new Carta();
        c.numero = (i);
        c.palo = EnumPalos.COPA.palosBien;
        return c;
    }

    public Carta cartaEspada(int i) {
        Carta c = new Carta();
        c.numero = (i);
        c.palo = EnumPalos.ESPADA.palosBien;
        return c;
    }
}
