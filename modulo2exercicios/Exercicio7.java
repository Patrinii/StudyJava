package modulo2exercicios;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos 3 vetores
        int[][] vetores = new int[3][];
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o tamanho do vetor " + (i + 1) + ": ");
            int tamanho = scanner.nextInt();
            vetores[i] = new int[tamanho];
            System.out.println("Digite os elementos do vetor " + (i + 1) + ": ");
            for (int j = 0; j < tamanho; j++) {
                vetores[i][j] = scanner.nextInt();
            }
        }

        // Calcula e exibe soma, produto e média de cada vetor
        double[] somas = new double[3];
        double[] produtos = new double[3];
        double[] medias = new double[3];
        
        for (int i = 0; i < 3; i++) {
            somas[i] = calcularSoma(vetores[i]);
            produtos[i] = calcularProduto(vetores[i]);
            medias[i] = calcularMedia(vetores[i]);

            System.out.println("Vetor " + (i + 1) + ":");
            System.out.println("Soma: " + somas[i]);
            System.out.println("Produto: " + produtos[i]);
            System.out.println("Média: " + medias[i]);
            System.out.println();
        }

        // Criação dos vetores de resultados finais
        double[] vetorSomas = {somas[0] + somas[1] + somas[2]};
        double[] vetorProdutos = {produtos[0] * produtos[1] * produtos[2]};
        double[] vetorMedias = medias.clone(); // Clonar as médias diretamente

        // Exibe os vetores de resultados
        System.out.println("Vetor das somas: " + Arrays.toString(vetorSomas));
        System.out.println("Vetor dos produtos: " + Arrays.toString(vetorProdutos));
        System.out.println("Vetor das médias: " + Arrays.toString(vetorMedias));

        // Cálculo final usando os vetores gerados
        double somaDasSomas = vetorSomas[0];
        double mediaDasMedias = calcularMedia(vetorMedias);
        double produtoDosProdutos = vetorProdutos[0];

        // Exibe os resultados finais
        System.out.println("\nResultados finais:");
        System.out.println("Soma do vetor de somas: " + somaDasSomas);
        System.out.println("Média do vetor de médias: " + mediaDasMedias);
        System.out.println("Produto do vetor de produtos: " + produtoDosProdutos);

        scanner.close();
    }

    // Função para calcular a soma dos elementos de um vetor
    public static double calcularSoma(int[] vetor) {
        double soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        return soma;
    }

    // Função para calcular o produto dos elementos de um vetor
    public static double calcularProduto(int[] vetor) {
        double produto = 1;
        for (int num : vetor) {
            produto *= num;
        }
        return produto;
    }

    // Função para calcular a média dos elementos de um vetor
    public static double calcularMedia(int[] vetor) {
        return calcularSoma(vetor) / vetor.length;
    }
    
    // Função sobrecarregada para calcular a média de um vetor de doubles (usada para o vetor de médias)
    public static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double num : vetor) {
            soma += num;
        }
        return soma / vetor.length;
    }
}

