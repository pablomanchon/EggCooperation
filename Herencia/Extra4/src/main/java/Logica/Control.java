package Logica;

import Entidades.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Control {
    ArrayList<Persona> personas = new ArrayList<Persona>();

    public void crearPersonas() {
        int i = 1;
        cartelPersona(i++);
        personas.add(new Persona());
        cartelPersona(i++);
        personas.add(new Empleado());
        cartelPersona(i++);
        personas.add(new Estudiante());
        cartelPersona(i++);
        personas.add(new Profesor());
        cartelPersona(i++);
        personas.add(new PersonalServicio());
    }

    private static void cartelPersona(int i) {
        System.out.println("\n_____Creacion de persona N°" + i +"_____");
    }

    public void Menu() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("__________MENU__________" +
                    "\n1. Cambio del estado civil" +
                    "\n2. Reasignación de despacho" +
                    "\n3. Matriculacion a un nuevo curso" +
                    "\n4. Cambio de departamento" +
                    "\n5. Traslado de seccion" +
                    "\n6. Imprimir individuos" +
                    "\n7. Salir");
        } while (opcionCorrecta(sc.next()));
    }

    private boolean opcionCorrecta(String opcion) {
        switch (opcion) {
            case "1" -> personas.get(Integer.valueOf(opcion) - 1).cambioEstadoCivil();
            case "2" -> ((Empleado) personas.get(Integer.valueOf(opcion) - 1)).reasignacionDespacho();
            case "3" -> ((Estudiante) personas.get(Integer.valueOf(opcion) - 1)).escogerCurso();
            case "4" -> ((Profesor) personas.get(Integer.valueOf(opcion) - 1)).cambioDepartamento();
            case "5" -> ((PersonalServicio) personas.get(Integer.valueOf(opcion) - 1)).transladoSeccion();
            case "6" -> {
                for (Persona aux : personas)
                    System.out.println(aux);
            }
            case "7" -> {
                System.out.println("Adios c:");
                return false;
            }
            default -> System.out.println("Opcion incorrecta, vuelva a intentarlo");
        }
        return true;
    }
}
