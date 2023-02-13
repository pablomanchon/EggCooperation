package Entidades;

public class EdificioDeOficinas extends Edificio {
    private Integer numOficinas, personasPorOficina, numPiso;

    public EdificioDeOficinas() {
    }

    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
        this.numPiso = numOficinas;
    }

    public Integer getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(Integer personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public Integer getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(Integer numPiso) {
        this.numPiso = numPiso;
    }

    public String cantPersonas() {
        String personasPorOficina, personasTotal;

        personasPorOficina = "Personas por oficina: " + String.valueOf(this.personasPorOficina) + "\n";
        personasTotal = "Personas en todo el edificio: " + String.valueOf(this.personasPorOficina*this.numPiso);

        return personasPorOficina + personasTotal;
    }

    @Override
    public Double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public Double calcularVolumen() {
        return ancho * largo * alto;
    }
}
