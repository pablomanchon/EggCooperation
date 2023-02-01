package Servicios;

import GUI.GraficaExt;

public class Control {
    GraficaExt gui= new GraficaExt();
    public void iniciarVentana(){
        gui.setVisible(true);
    }
    public void llamarCartas(){
        gui.pruebaCartas();
    }
}
