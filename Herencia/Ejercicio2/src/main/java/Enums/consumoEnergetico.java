package Enums;

public enum consumoEnergetico {
    A('A',1000),B('B',800),C('C',600),D('D',500),E('E',300),F('F',100);
    public Integer precioConsumo;
    public char letra;

    consumoEnergetico(char letra, Integer precioConsumo) {
        this.letra = letra;
        this.precioConsumo = precioConsumo;
    }
}
