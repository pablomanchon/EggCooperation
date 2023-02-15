package Entidades;

import Enums.Seccion;

import java.util.Arrays;

public final class PersonalServicio extends Persona {
    private Seccion seccion;

    public PersonalServicio() {
        crearPersonalServicio();
    }


    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "PersonalServicio{" +
                "seccion=" + seccion +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", numIdentificacion=" + numIdentificacion +
                ", sc=" + sc +
                '}';
    }

    private void crearPersonalServicio() {
        System.out.println("Seccion: ");

        mostrarSecciones();

        while (this.seccion == null) {

            String opcion = sc.next();

            for (Seccion aux : Seccion.values()) {
                if (opcion.equalsIgnoreCase(aux.n)) {
                    this.seccion = aux;
                    break;
                }
            }
            if (seccion == null)
                System.out.println("Opcion incorrecta, vuelva a intentarlo");

        }
    }

    private static void mostrarSecciones() {
        for (Seccion aux : Seccion.values())
            System.out.print("|" + aux.n + "|");
    }

    public void transladoSeccion() {
        System.out.println("¿A que sección se cambiará?");
        mostrarSecciones();
        String opcion = sc.next();
        boolean match = false;

        while (!match) {
            if (opcion.equalsIgnoreCase(this.seccion.n)) {
                System.out.println("Usted ya se encuentra en ésta seccion");

            } else if (!Arrays.asList(Seccion.values()).
                    contains(opcion.toUpperCase())) {
                System.out.println("Opcion incorrecta, vuelva a intentarlo");

            } else {
                for (Seccion aux : Seccion.values()) {
                    if (aux.n.equalsIgnoreCase(opcion)) {
                        this.seccion = aux;
                        System.out.println("¡Cambio realizado con éxito!");
                        match = true;
                        break;
                    }
                }
            }
        }
    }

}
