package Entidades;

import Enums.PosicionActual;
import java.util.Arrays;
import java.util.Random;

public class Revolver {

    private PosicionActual[] posicion = new PosicionActual[6];

    public Revolver() {
        for (int i = 0; i < 6; i++) {
            posicion[i] = posicion[i].VACIO;
        }
    }

    public PosicionActual[] getPosicion() {
        return posicion;
    }

    public void setPosicion(PosicionActual[] posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicion=" + Arrays.toString(posicion) + '}';
    }

    public void llenarRevolver() {
        rdm = new Random();
        for (int i = 0; i < 6; i++) {
            if (rdm.nextInt(2) == 1 && i != 5) {
                posicion[i] = PosicionActual.AGUA;
                break;
            } else if (i == 5) {
                posicion[i] = PosicionActual.AGUA;
            }
        }
    }
    private Random rdm = new Random();
    private Integer pos = rdm.nextInt(6);

    public boolean mojar() {
        return posicion[pos].equals(PosicionActual.AGUA);
    }

    public void siguienteChorro() {
        pos++;
        if (pos>5){
            pos = 0;
        }
    }

}
