package modulo3exercicios;
public class Exercicio3 {
    // Atributos da classe
    private String nome;
    private double preco;
    private int quantidade;
    private boolean comprado;

    // Construtor para inicializar os atributos
    public Exercicio3(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.comprado = false; // Inicialmente o produto não está comprado
    }

    // Método para comprar o produto
    public void comprarProduto() {
        this.comprado = true;
        double valorTotal = calcularValorTotal();
        System.out.printf("Produto: %s | Valor total a pagar: R$ %.2f%n", nome, valorTotal);
    }

    // Método para calcular o valor total com desconto
    private double calcularValorTotal() {
        double valorSemDesconto = preco * quantidade;
        double desconto = 0.0;

        // Aplicação do desconto conforme a tabela
        if (valorSemDesconto > 500) {
            desconto = 0.25;
        } else if (valorSemDesconto > 200) {
            desconto = 0.20;
        } else if (valorSemDesconto > 100) {
            desconto = 0.10;
        } // Sem desconto para valores até 100

        // Calcula o valor total com o desconto aplicado
        return valorSemDesconto * (1 - desconto);
    }

    // Métodos get e set para acessar os atributos, se necessário
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean isComprado() {
        return comprado;
    }

    // Main para testar a classe Produto
    public static void main(String[] args) {
        // Criando exemplos de produtos
        Exercicio3 produto1 = new Exercicio3("Mouse", 50.0, 2);
        Exercicio3 produto2 = new Exercicio3("Teclado", 120.0, 1);
        Exercicio3 produto3 = new Exercicio3("Monitor", 250.0, 1);
        Exercicio3 produto4 = new Exercicio3("Notebook", 600.0, 1);

        // Comprando os produtos
        produto1.comprarProduto(); // Sem desconto
        produto2.comprarProduto(); // 10% de desconto
        produto3.comprarProduto(); // 20% de desconto
        produto4.comprarProduto(); // 25% de desconto
    }
}
