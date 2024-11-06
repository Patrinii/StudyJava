package modulo2exercicios;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        // Converte a palavra em um array de caracteres
        char[] caracteres = palavra.toCharArray();
        
        // Variável para verificar se é um palíndromo
        boolean ehPalindromo = true;
        
        // Verifica se a palavra é igual de trás para frente
        for (int i = 0; i < caracteres.length / 2; i++) {
            if (caracteres[i] != caracteres[caracteres.length - 1 - i]) {
                ehPalindromo = false;
                break;
            }
        }
        
        // Exibe o resultado
        if (ehPalindromo) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
        
        scanner.close();
    }
}
