package exercicio10;

public class Boleto extends Transacao implements MeioDePagamento {
    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento de R$ " + valor + " realizado com boleto bancário.");
    }

    @Override
    public void executarTransacao() {
        System.out.println("Transação de boleto de R$ " + valor + " em execução.");
        pagar();
    }
}
