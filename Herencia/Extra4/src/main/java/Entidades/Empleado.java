package Entidades;

public class Empleado extends Persona {
    private Integer anioIncorporacion, numDespacho;

    public Empleado() {
        crearEmpleado();
    }

    public Integer getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(Integer anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public Integer getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(Integer numDespacho) {
        this.numDespacho = numDespacho;
    }

    private void crearEmpleado() {
        super.crearPersona();

        System.out.print("Año de incorporacion: ");
        sc.nextInt();

        System.out.print("Número de Despacho: ");
        sc.nextInt();
    }

    public void reasignacionDespacho() {
        System.out.println("__________Reasignacion Despacho__________");
        System.out.print("Nuevo despacho: ");
        this.numDespacho = sc.nextInt();
    }
}
