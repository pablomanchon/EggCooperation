package Enums;

public enum Razas {
    BEAGLE("Beagle"), CANICHE("Caniche"), DOGO("Dogo"), PITBULL("Pitbull"), CALLEJERO("Callejero");
    
    public String raza;

    private Razas(String raza) {
        this.raza = raza;
    }
    
}
