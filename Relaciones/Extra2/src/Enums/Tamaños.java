package Enums;

public enum Tamaños {
    GRANDE("G"), CHICO("C"), MEDIANO("M");
    
    public String letra;

    private Tamaños(String letra) {
        this.letra = letra;
    }

    public String getLetra() {
        return letra;
    }
    
    
}
