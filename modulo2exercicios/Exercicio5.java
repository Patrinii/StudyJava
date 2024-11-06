package modulo2exercicios;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebendo o número de nomes e os nomes do usuário
        System.out.print("Quantos nomes deseja inserir? ");
        int quantidadeNomes = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o número de nomes

        String[] nomes = new String[quantidadeNomes];
        System.out.println("Insira os nomes:");
        for (int i = 0; i < quantidadeNomes; i++) {
            nomes[i] = scanner.nextLine();
        }

        // Processando cada nome para identificar vogais e consoantes
        for (String nome : nomes) {
            System.out.println("Analisando o nome: " + nome);
            analisarNome(nome);
            System.out.println();
        }

        scanner.close();
    }

    // Função para analisar e exibir vogais e consoantes em um nome
    public static void analisarNome(String nome) {
        System.out.print("Vogais: ");
        for (char letra : nome.toCharArray()) {
            if (eVogal(letra)) {
                System.out.print(letra + " ");
            }
        }
        System.out.println();

        System.out.print("Consoantes: ");
        for (char letra : nome.toCharArray()) {
            if (!eVogal(letra) && Character.isLetter(letra)) {
                System.out.print(letra + " ");
            }
        }
        System.out.println();
    }

    // Função auxiliar para verificar se um caractere é uma vogal
    public static boolean eVogal(char letra) {
        letra = Character.toLowerCase(letra); // Ignora maiúsculas e minúsculas
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}

