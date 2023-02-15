package Entidades;

import java.util.ArrayList;

public class Estudiante extends Persona{
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

    private void crearEstudiante(){
        super.crearPersona();
        System.out.print("Curso en el que está matriculado: ");
        this.curso.add(sc.next());
    }
    public void reasignarCurso(){
        System.out.println("__________Reasignacion curso__________");
        System.out.println("Seleccion nuevo curso: ");
        this.curso.add(sc.next());
    }
}
