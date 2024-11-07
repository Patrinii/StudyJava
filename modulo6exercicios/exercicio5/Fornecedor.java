package exercicio5;

public class Fornecedor extends Pessoa implements Pagavel {
    private double valorFatura;

    public Fornecedor(String nome, String documento, double valorFatura) {
        super(nome, documento);
        this.valorFatura = valorFatura;
    }

    @Override
    public double calcularPagamento() {
        return valorFatura; // O pagamento do fornecedor é igual ao valor da fatura
    }
}
