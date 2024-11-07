package exercicio10;

public class CartaoDeCredito extends Transacao implements MeioDePagamento {
    public CartaoDeCredito(double valor) {
        super(valor);
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão de crédito.");
    }

    @Override
    public void executarTransacao() {
        System.out.println("Transação de cartão de crédito de R$ " + valor + " em execução.");
        pagar();
    }
}
