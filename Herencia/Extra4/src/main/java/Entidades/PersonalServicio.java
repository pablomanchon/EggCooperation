package Entidades;

import Enums.Seccion;

public final class PersonalServicio extends Persona {
    private Seccion seccion;

    public PersonalServicio() {
        crearPersonalServicio();
    }


    public Seccion getSeccion() {
        return seccion;
    }

    private void crearPersonalServicio() {
        super.crearPersona();
        System.out.println("Seccion: ");

        for (Seccion aux: Seccion.values())
            System.out.print("|"+aux.n+"|");

        while (this.seccion == null) {

            String opcion = sc.next();

            for (Seccion aux : Seccion.values()) {
                if (opcion.equalsIgnoreCase(aux.n)) {
                    this.seccion = aux;
                    break;
                }
            }
            if(seccion == null)
                System.out.println("Opcion incorrecta, vuelva a intentarlo");

        }
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
}
