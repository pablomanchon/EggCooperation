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

    @Override
    public String toString() {
        return "Empleado{" +
                "anioIncorporacion=" + anioIncorporacion +
                ", numDespacho=" + numDespacho +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", numIdentificacion=" + numIdentificacion +
                ", sc=" + sc +
                '}';
    }

    private void crearEmpleado() {
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
