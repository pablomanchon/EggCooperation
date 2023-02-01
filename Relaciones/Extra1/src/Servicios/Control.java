package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import Enums.Razas;
import Enums.Tamanio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Control {

    ArrayList<Persona> personas = new ArrayList();
    ArrayList<Perro> perros = new ArrayList();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearPerros() {
        Perro[] perritus = new Perro[5];

        perritus[0] = new Perro("Cual", Razas.DOGO.raza, Tamanio.GRANDE.tamanio, 15);
        perritus[1] = new Perro("Fernando Chiquito", Razas.BEAGLE.raza, Tamanio.CHIQUITO.tamanio, 13);
        perritus[2] = new Perro("Miguelito", Razas.CALLEJERO.raza, Tamanio.GRANDE.tamanio, 10);
        perritus[3] = new Perro("Helio", Razas.PITBULL.raza, Tamanio.MEDIANO.tamanio, 9);
        perritus[4] = new Perro("Juanete", Razas.CANICHE.raza, Tamanio.CHIQUITO.tamanio, 4);

        perros.add(new Perro("Firulais", Razas.CANICHE.raza, Tamanio.CHIQUITO.tamanio, 7));

        perros.addAll(Arrays.asList(perritus));
    }

    public void crearPersona() {
        do {
            String nombre, apellido, documento;
            int edad;

            System.out.println("____Creación de Persona____");

            System.out.print("Nombre: ");
            nombre = sc.next();

            System.out.print("Apellido: ");
            apellido = sc.next();

            System.out.print("Edad: ");
            edad = sc.nextInt();

            System.out.print("Documento: ");
            documento = sc.next();

            personas.add(new Persona(nombre, apellido, documento, edad));
        } while (continuar());
    }

    private boolean continuar() {
        System.out.println("¿Desea continuar? (S/N)");
        boolean opcionValida;
        String opcion;
        do {
            opcion = sc.next().toUpperCase();
            opcionValida = opcion.equals("S") || opcion.equals("N");
            if (!opcionValida) {
                System.out.println("Opción incorrecta, vuelva a intentarlo");
            }
        } while (!opcionValida);
        return opcion.equals("S");
    }

    private int id = 0;

    public void adoptarPerro() {
        do {
            if (perros.isEmpty()) {
                System.out.println("No hay perros, vuelva pronto");
                break;
            } else {
                do {
                    System.out.println("Ingrese su DNI");
                } while (!DNIValido());

            System.out.println(personas.get(id).getNombre());

            System.out.println(perrosDisponibles());

            buscarPerro();
            }
            id = 0;
        } while (continuar());
    }

    private boolean buscarPerro() {

        System.out.println("Escoja el nombre del perro que desea adoptar: ");
        String eleccion = sc.next();

        for (Perro perro : perros) {
            if (perro.getNombre().equalsIgnoreCase(eleccion)) {
                System.out.println("Adoptado!");
                personas.get(id).getPerros().add(perro);
                perros.remove(perro);
                return true;
            }
        }
        System.out.println("Éste perro no se encuentra");
        return false;
    }

    private String perrosDisponibles() {
        String perrosDisponibles = "Perros disponibles: ";
        for (Perro p : perros) {
            perrosDisponibles += "\n" + p.getNombre();
        }
        return perrosDisponibles;
    }

    private boolean DNIValido() {
        String dni = sc.next();
        for (Persona persona : personas) {
            if (persona.getDocumento().equals(dni)) {
                System.out.println("¡Usuario encontrado!");
                return true;
            }
            id++;
        }
        id = 0;
        System.out.println("El DNI no se encuentra, vuelva a intentarlo");
        return false;
    }

    public void imprimirPersonas() {
        System.out.println(personas);
        System.out.println(perros);
    }

}
