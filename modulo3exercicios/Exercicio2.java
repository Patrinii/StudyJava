package modulo3exercicios;
public class Exercicio2 {
    // Atributos da classe
    private String numeroItem;
    private String descricaoItem;
    private int quantidade;
    private double precoUnitario;

    // Construtor para inicializar os atributos
    public Exercicio2(String numeroItem, String descricaoItem, int quantidade, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        // Configura a quantidade como 0 se não for positiva
        this.quantidade = quantidade > 0 ? quantidade : 0;
        // Configura o preço unitário como 0.0 se não for positivo
        this.precoUnitario = precoUnitario > 0 ? precoUnitario : 0.0;
    }

    // Métodos get e set para numeroItem
    public String getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(String numeroItem) {
        this.numeroItem = numeroItem;
    }

    // Métodos get e set para descricaoItem
    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    // Métodos get e set para quantidade
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade > 0 ? quantidade : 0;
    }

    // Métodos get e set para precoUnitario
    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario > 0 ? precoUnitario : 0.0;
    }

    // Método para calcular o valor da fatura
    public double getValorFatura() {
        return quantidade * precoUnitario;
    }

    // Método para aplicar um desconto percentual ao preço unitário
    public void aplicarDesconto(double percentualDesconto) {
        if (percentualDesconto > 0 && percentualDesconto <= 100) {
            precoUnitario -= (precoUnitario * (percentualDesconto / 100));
        } else {
            System.out.println("Desconto inválido. Deve ser entre 0 e 100.");
        }
    }

    // Main para testar a classe Fatura
    public static void main(String[] args) {
        // Criação de uma instância de Fatura
        Exercicio2 fatura = new Exercicio2("001", "Teclado Mecânico", 5, 150.0);

        // Exibe o valor da fatura antes do desconto
        System.out.println("Valor da Fatura (antes do desconto): R$ " + fatura.getValorFatura());

        // Aplica um desconto de 10% e exibe o valor atualizado
        fatura.aplicarDesconto(10);
        System.out.println("Valor da Fatura (após 10% de desconto): R$ " + fatura.getValorFatura());
    }
}
