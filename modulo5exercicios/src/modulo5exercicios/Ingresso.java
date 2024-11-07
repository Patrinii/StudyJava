package modulo5exercicios;

public class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Valor do ingresso: R$ " + valor;
    }

    public double getValor() {
        return valor;
    }
}
