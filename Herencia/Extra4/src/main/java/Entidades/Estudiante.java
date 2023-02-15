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

    @Override
    public String toString() {
        return "Estudiante{" +
                "curso=" + curso +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", numIdentificacion=" + numIdentificacion +
                ", sc=" + sc +
                '}';
    }

    private void crearEstudiante() {
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

        } while (!opcionCorrecta);
    }

    private static void mostrarCursos() {
        for (Departamento aux : Departamento.values())
            System.out.print("|" + aux.n + "|");
    }

}
