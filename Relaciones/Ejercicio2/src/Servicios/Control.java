package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Control {

    public void crearJuego() {
        Juego juego = new Juego();
        juego.llenarJuego(crearJugadores(), crearRevolver());
        juego.ronda();
    }

    Scanner sc = new Scanner(System.in);

    private ArrayList<Jugador> crearJugadores() {

        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("Agregar Jugadores");
        Integer id = 1;
        System.out.println("Cantidad de jugadores: ");
            Integer cantidadJugadores = sc.nextInt();
        if (cantidadJugadores<0||cantidadJugadores>6) {
            cantidadJugadores = 6;
        }
        for (int i = 0; i < cantidadJugadores; i++) {
            Jugador j = new Jugador();
            System.out.print("Nombre del jugador " + (i+1) +": ");
            j.setNombre(sc.next());
            j.setID("Jugador " + String.valueOf(id++));
            jugadores.add(j);
        }

        return jugadores;
    }

    private Revolver crearRevolver() {
        Revolver r = new Revolver();
        r.llenarRevolver();
        System.out.println(Arrays.toString(r.getPosicion()));
        return r;
    }

    private boolean agregarOtro() {

        System.out.println("¿Desea Agregar otro jugador?(S/N)");
        String opcion = sc.next().toLowerCase();

        return opcion.equals("s");
    }
}
