package exercicio10;

public abstract class Transacao {
    protected double valor;

    public Transacao(double valor) {
        this.valor = valor;
    }

    public abstract void executarTransacao();

    public double getValor() {
        return valor;
    }
}
