package modulo2exercicios;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // a) Array para armazenar nomes dos produtos
        String[] produtos = new String[100];
        
        // b) Array para armazenar a quantidade em estoque de cada produto
        int[] quantidades = new int[100];
        
        // Variável para rastrear o número de produtos cadastrados
        int numProdutos = 0;
        
        while (true) {
            System.out.println("\n=== Sistema de Gerenciamento de Estoque ===");
            System.out.println("1. Cadastrar novo produto");
            System.out.println("2. Consultar quantidade de produto");
            System.out.println("3. Atualizar estoque de produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    numProdutos = cadastrarProduto(produtos, quantidades, numProdutos, scanner);
                    break;
                case 2:
                    consultarProduto(produtos, quantidades, numProdutos, scanner);
                    break;
                case 3:
                    atualizarEstoque(produtos, quantidades, numProdutos, scanner);
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // c) Função para cadastrar novos produtos
    public static int cadastrarProduto(String[] produtos, int[] quantidades, int numProdutos, Scanner scanner) {
        if (numProdutos >= produtos.length) {
            System.out.println("Capacidade máxima de produtos atingida!");
            return numProdutos;
        }
        
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a quantidade em estoque do produto: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        
        produtos[numProdutos] = nome;
        quantidades[numProdutos] = quantidade;
        System.out.println("Produto cadastrado com sucesso!");
        
        return numProdutos + 1;
    }

    // Função para consultar a quantidade de um produto específico
    public static void consultarProduto(String[] produtos, int[] quantidades, int numProdutos, Scanner scanner) {
        System.out.print("Digite o nome do produto para consulta: ");
        String nome = scanner.nextLine();
        
        for (int i = 0; i < numProdutos; i++) {
            if (produtos[i].equalsIgnoreCase(nome)) {
                System.out.println("Quantidade em estoque de " + nome + ": " + quantidades[i]);
                return;
            }
        }
        
        System.out.println("Produto não encontrado.");
    }

    // e) Função para atualizar o estoque de um produto
    public static void atualizarEstoque(String[] produtos, int[] quantidades, int numProdutos, Scanner scanner) {
        System.out.print("Digite o nome do produto para atualizar: ");
        String nome = scanner.nextLine();
        
        for (int i = 0; i < numProdutos; i++) {
            if (produtos[i].equalsIgnoreCase(nome)) {
                System.out.print("Digite a quantidade para aumentar (positivo) ou diminuir (negativo): ");
                int quantidade = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha
                
                quantidades[i] += quantidade;
                
                if (quantidades[i] < 0) {
                    quantidades[i] = 0;
                    System.out.println("A quantidade de " + nome + " foi ajustada para 0 (estoque não pode ser negativo).");
                } else {
                    System.out.println("Estoque atualizado com sucesso!");
                }
                
                return;
            }
        }
        
        System.out.println("Produto não encontrado.");
    }
}
