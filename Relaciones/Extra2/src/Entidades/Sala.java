package Entidades;

import Enums.Asientos;
import java.util.ArrayList;
import java.util.Arrays;

public class Sala {

    private String[][] asientos = new String[6][8];
    private String letra;
    private ArrayList<Persona> espectadores = new ArrayList();

    public Sala() {
        crearAsientos();
    }

    public String[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public ArrayList<Persona> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Persona> espectadores) {
        this.espectadores = espectadores;
    }

    @Override
    public String toString() {
        return "asientos: " + Arrays.toString(asientos) + ", letra: " + letra + ", espectadores: " + espectadores;
    }

    private void crearAsientos() {
        for (int i = 7; i >= 0; i--) {
            for (Asientos a : Asientos.values()) {
                String asiento = a + String.valueOf(i + 1);
                this.asientos[a.num][i] = asiento;
                System.out.print("|" + asientos[a.num][i] + "|");
            }
            System.out.println();
        }
    }

    public void llenarAsientos() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (this.asientos[i][j].contains("X")) {
                    j--;
                }else{
                    
                }
            }
        }
    }

}
