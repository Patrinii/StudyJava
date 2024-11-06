package modulo2exercicios;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a) Leitura dos nomes dos funcionários que podem ser votados
        System.out.print("Quantos funcionários estão participando da votação? ");
        int numFuncionarios = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        String[] funcionarios = new String[numFuncionarios];
        System.out.println("Digite o nome dos funcionários:");
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.print("Funcionário " + (i + 1) + ": ");
            funcionarios[i] = scanner.nextLine();
        }

        // Inicializa o array de contagem de votos
        int[] votos = new int[numFuncionarios];

        // b) Leitura do número de votos
        System.out.print("Quantos votos serão realizados? ");
        int numVotos = scanner.nextInt();

        // c) Votação e validação
        for (int i = 0; i < numVotos; i++) {
            System.out.println("Votação " + (i + 1) + ":");
            System.out.print("Escolha o número do funcionário em quem deseja votar (1 a " + numFuncionarios + "): ");
            int voto = scanner.nextInt();

            // Verifica se o voto é válido
            if (voto >= 1 && voto <= numFuncionarios) {
                votos[voto - 1]++; // Incrementa o voto para o funcionário correspondente
                System.out.println("Voto registrado para " + funcionarios[voto - 1] + ".");
            } else {
                System.out.println("Voto inválido. Tente novamente.");
                i--; // Repete a votação se o voto foi inválido
            }
        }

        // e) Determina o funcionário com o maior número de votos
        String vencedor = determinarVencedor(funcionarios, votos);

        // Exibe o resultado
        System.out.println("Funcionário do Mês: " + vencedor);
        System.out.println("Total de votos recebidos: " + votos[indiceVencedor(votos)]);
        
        scanner.close();
    }

    // Função para determinar o índice do funcionário com o maior número de votos
    public static String determinarVencedor(String[] funcionarios, int[] votos) {
        int indiceVencedor = 0;
        for (int i = 1; i < votos.length; i++) {
            if (votos[i] > votos[indiceVencedor]) {
                indiceVencedor = i;
            }
        }
        return funcionarios[indiceVencedor];
    }
  
    // Função auxiliar para encontrar o índice do vencedor
    public static int indiceVencedor(int[] votos) {
        int maxIndex = 0;
        for (int i = 1; i < votos.length; i++) {
            if (votos[i] > votos[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
