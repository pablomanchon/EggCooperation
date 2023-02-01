package Enums;

public enum Tamanio {
    CHIQUITO("Chiquito"), MEDIANO("Mediano"), GRANDE("Grande");
    
    public String tamanio;

    private Tamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
}
