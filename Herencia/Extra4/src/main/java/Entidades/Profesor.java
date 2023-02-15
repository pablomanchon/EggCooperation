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

    private void crearProfesor() {
        super.crearPersona();
        System.out.println("¿A qué departamento pertenece?");

        for (Departamento aux : Departamento.values()) System.out.print("|" + aux.n + "|");

        while (this.departamento == null) {

            String opcion = sc.next();

            for (Departamento aux : Departamento.values()) {
                if (opcion.equalsIgnoreCase(aux.n)) {
                    this.departamento = aux;
                    break;
                }
            }

            if (departamento == null)
                System.out.println("Opcion incorrecta, vuelva a ingresar");

        }
    }
}
