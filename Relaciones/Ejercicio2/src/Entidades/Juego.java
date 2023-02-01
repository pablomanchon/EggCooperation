package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    ArrayList<Jugador> jugadores = new ArrayList();
    Revolver r = new Revolver();

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        this.r = r;
        this.jugadores = jugadores;
    }

//    ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    
    Scanner sc = new Scanner(System.in);

    public void ronda() {
        Integer jugador = 0;
        do {
            System.out.print("Enter para Disparar");
            sc.nextLine();
            if (jugador == jugadores.size()) {
                jugador = 0;
            }
            if (jugadores.get(jugador).Disparo(r)) {
                System.out.println("¡¡MOJADO!!");
                System.out.println(jugadores.get(jugador).getNombre() + " ha sido mojado");
                break;
            } else if (jugador == jugadores.size() - 1) {
                System.out.println("Turno de " + jugadores.get(0).getNombre());
            }else{   
                System.out.println("Turno de " + jugadores.get(jugador + 1).getNombre());
            }
            jugador++;
        } while (true);
    }
}
