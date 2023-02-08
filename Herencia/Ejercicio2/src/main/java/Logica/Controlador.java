package Logica;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;


public class Controlador {
    Lavadora lavadora = new Lavadora();
    Televisor televisor = new Televisor();

    public void crearElectrodomesticos() {
        lavadora.crearLavadora();
        televisor.crearTelevisor();
    }

    public void verPrecios() {
        System.out.println(lavadora.precioFinal());
        System.out.println(televisor.precioFinal());
    }
}
