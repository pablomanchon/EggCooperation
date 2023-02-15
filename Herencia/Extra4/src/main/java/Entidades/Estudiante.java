package Entidades;

import Enums.Departamento;

import java.util.ArrayList;

public class Estudiante extends Persona {
    private ArrayList<String> curso = new ArrayList();

    public Estudiante() {
        crearEstudiante();
    }

    public ArrayList<String> getCurso() {
        return curso;
    }

    public void setCurso(ArrayList<String> curso) {
        this.curso = curso;
    }

    private void crearEstudiante() {
        super.crearPersona();
        System.out.print("Curso en el que está matriculado: ");
        escogerCurso();
    }

    public void escogerCurso() {
        mostrarCursos();
        Boolean opcionCorrecta = false;
        do {
            String opcion = sc.next();
            for (Departamento aux : Departamento.values()) {
                if (this.curso.contains(aux.n)) {
                    System.out.println("Ya se encuentra en el curso de " + aux.n);
                    opcionCorrecta = true;
                    break;
                }
                if (opcion.equalsIgnoreCase(aux.n)) {
                    this.curso.add(aux.n);
                    System.out.println("¡Curso añadido con exito!");
                    opcionCorrecta = true;
                    break;
                }
            }
            if (!opcionCorrecta)
                System.out.println("Opcion inorrecta, Vuelva a intentarlo");

        } while (this.curso.isEmpty());
    }

    private static void mostrarCursos() {
        for (Departamento aux : Departamento.values())
            System.out.print("|" + aux.n + "|");
    }

}
