package exercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando dados do usuário
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço de custo do produto: R$ ");
        double precoCusto = scanner.nextDouble();

        System.out.print("Digite o preço de venda do produto: R$ ");
        double precoVenda = scanner.nextDouble();

        System.out.print("Digite as despesas da empresa para o produto: R$ ");
        double despesas = scanner.nextDouble();

        // Criando objeto Produto
        Produto produto = new Produto(nome, precoCusto, precoVenda, despesas);

        // Calculando e exibindo a margem de lucro
        double margemLucro = produto.calcularMargemLucro();
        System.out.printf("A margem de lucro do produto %s é de %.2f%%.%n", produto.getNome(), margemLucro);

        scanner.close();
    }
}
