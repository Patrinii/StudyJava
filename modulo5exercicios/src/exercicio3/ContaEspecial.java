package exercicio3;

public class ContaEspecial extends ContaCorrente {
    private double limite;

    public ContaEspecial(String titular, double saldoInicial, double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
            return true;
        } else {
            System.out.println("Saque não realizado. Limite insuficiente.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Titular: " + titular + ", Saldo: R$ " + saldo + ", Limite: R$ " + limite;
    }
}
