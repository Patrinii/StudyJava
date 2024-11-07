package exercicio8;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calcularRendimento() {
        System.out.println("Conta corrente não possui rendimento.");
        return 0;
    }
}
