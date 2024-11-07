package modulo5exercicios;

public class IngressoVIP extends Ingresso {
    private double valorAdicional;

    public IngressoVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return "Valor do ingresso VIP: R$ " + (valor + valorAdicional);
    }

    @Override
    public double getValor() {
        return super.getValor() + valorAdicional;
    }
}
