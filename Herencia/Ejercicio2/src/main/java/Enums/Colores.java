package Enums;

/*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
        usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
        blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
        minúsculas. Este método se invocará al crear el objeto y no será visible.*/
public enum Colores {
    BLANCO("Blanco"), NEGRO("Negro"), ROJO("Rojo"), AZUL("Azul"), GRIS("Gris");
    public String l;

    Colores() {
    }

    Colores(String l) {
        this.l = l;
    }
}
