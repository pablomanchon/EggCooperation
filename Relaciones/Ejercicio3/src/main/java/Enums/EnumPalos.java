package Enums;

public enum EnumPalos {
    ESPADA("Espada"), ORO("Oro"), BASTO("Basto"), COPA("Copa");
    public String palosBien;

    EnumPalos(String nombrePalo) {
        this.palosBien = nombrePalo;
    }
}
