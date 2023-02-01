package Servicios;

import Entidades.Carta;
import Entidades.Mazo;

import java.util.*;

public class Control {
    Mazo m = new Mazo();

    public void llenarMazo() {
        LinkedList<Carta> cartas = new LinkedList<Carta>();
        for (int i = 1; i < 13; i++) {
            Carta c = new Carta();
            if (i != 8 && i != 9) {
                crearCartas(cartas, i, c);
            }
        }
        m.setCartas(cartas);
    }

    private static void crearCartas(LinkedList<Carta> cartas, int i, Carta c) {
        cartas.add(c.cartaBasto(i));
        cartas.add(c.cartaCopa(i));
        cartas.add(c.cartaEspada(i));
        cartas.add(c.cartaOro(i));
    }

    Scanner sc = new Scanner(System.in);

    public void Menu() {
        do {
            System.out.println("____Menu____");
            System.out.println("1. Barajar" +
                    "\n2. Siguiente carta" +
                    "\n3. Cartas disponibles" +
                    "\n4. Dar cartas" +
                    "\n5. Cartas monton" +
                    "\n6. Mostrar Baraja" +
                    "\n7. Salir");
            System.out.println("________________");
        } while (opciones(sc.nextInt()));
    }

    private boolean opciones(int opcion) {
        switch (opcion) {
            case 1 -> m.barajar();
            case 2 -> m.siguienteCarta();
            case 3 -> m.cartasDisponibles();
            case 4 -> {
                System.out.println("Cuantas cartas desea dar?");
                int cantCartas = sc.nextInt();
                if (cantCartas > m.getCartas().size()) {
                    System.out.println("No alcanzan las cartas, solo dispone de " + m.getCartas().size());
                } else {
                    System.out.print("Repartiendo cartas");
                    for (int i = 0; i < cantCartas; i++) {
                        m.darCartas();
                    }
                }
            }
            case 5 -> m.cartasMonton();
            case 6 -> m.mostrarBaraja();
            case 7 -> {
                System.out.println("¡ADIOS!");
                return false;
            }
            default -> System.out.println("Opcion incorrecta");
        }
        esperar3Segundos();
        return true;
    }

    private static void esperar3Segundos() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print(".");
                Thread.sleep(1000);
                if (i == 2) {
                    System.out.println("Listo!");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }

}
