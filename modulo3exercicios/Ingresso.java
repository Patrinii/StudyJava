package modulo3exercicios;
public class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Valor do Ingresso: R$ " + valor;
    }
}
