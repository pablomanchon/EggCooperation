package Entidades;

import Enums.Departamento;

public final class Profesor extends Persona {
    private Departamento departamento;

    public Profesor() {
        crearProfesor();
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "departamento=" + departamento +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", numIdentificacion=" + numIdentificacion +
                ", sc=" + sc +
                '}';
    }

    private void crearProfesor() {
        System.out.println("¿A qué departamento pertenece?");

        mostrarDepartamentos();

        escojerDepartamento();

    }

    private void escojerDepartamento() {
        boolean match = false;
        while (!match) {
            String opcion = sc.next();

            for (Departamento aux : Departamento.values()) {
                if (opcion.equalsIgnoreCase(aux.n)) {
                    this.departamento = aux;
                    match = true;
                    break;
                }
            }
            if (!match)
                System.out.println("Opcion incorrecta, vuelva a ingresar");
        }
    }

    private void escojerDepartamento(String opcion) {
        boolean match = false;
        while (!match) {
            for (Departamento aux : Departamento.values()) {
                if (opcion.equalsIgnoreCase(aux.n)) {
                    this.departamento = aux;
                    match = true;
                    break;
                }
            }
            if (!match)
                System.out.println("Opcion incorrecta, vuelva a ingresar");
        }
    }

    private static void mostrarDepartamentos() {
        for (Departamento aux : Departamento.values()) System.out.print("|" + aux.n + "|");
    }

    public void cambioDepartamento() {
        System.out.println("A qué departamento se cambiará? ");
        mostrarDepartamentos();
        String opcion = sc.next();
        if (opcion.equalsIgnoreCase(this.departamento.n)) {
            System.out.println("Usted ya se encuentra en éste departamento");
        } else {
            escojerDepartamento(opcion);
        }
    }
}
