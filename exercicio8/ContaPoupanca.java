package exercicio8;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(double saldoInicial, double taxaRendimento) {
        super(saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public double calcularRendimento() {
        double rendimento = saldo * taxaRendimento;
        System.out.println("Rendimento da poupança: R$ " + rendimento);
        return rendimento;
    }
}
