package Main;

import Servicios.Control;

public class Main {
    public static void main(String[] args) {
        Control c = new Control();
        c.crearPerros();
        c.crearPersona();
        c.adoptarPerro();
        c.imprimirPersonas();
    }
}
