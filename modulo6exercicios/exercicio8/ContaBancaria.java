package exercicio8;

public abstract class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public abstract double calcularRendimento();
}
