package Entidades;

public class Cuotas {
    private int numeroCuota, totalCuota;
    private boolean pagada;
    private String formaDePago, vencimiento;

    @Override
    public String toString() {
        return "Cuotas{" +
                "numeroCuota=" + numeroCuota +
                ", totalCuota=" + totalCuota +
                ", pagada=" + pagada +
                ", formaDePago='" + formaDePago + '\'' +
                ", vencimiento='" + vencimiento + '\'' +
                '}';
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public int getTotalCuota() {
        return totalCuota;
    }

    public void setTotalCuota(int totalCuota) {
        this.totalCuota = totalCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Cuotas() {
    }

    public Cuotas(int numeroCuota, int totalCuota, boolean pagada, String formaDePago, String vencimiento) {
        this.numeroCuota = numeroCuota;
        this.totalCuota = totalCuota;
        this.pagada = pagada;
        this.formaDePago = formaDePago;
        this.vencimiento = vencimiento;
    }
}
