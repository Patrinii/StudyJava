package modulo3exercicios;
public class IngressoVIP extends Ingresso {
    private double valorAdicional;

    public IngressoVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return "Valor do Ingresso VIP: R$ " + (valor + valorAdicional);
    }

    public double getValorTotal() {
        return valor + valorAdicional;
    }
}
