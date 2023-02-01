package Enums;

public enum PosicionActual {
    VACIO(1), AGUA(2);
    Integer pos;
    private PosicionActual(Integer pos) {
        this.pos = pos;
    }

}
