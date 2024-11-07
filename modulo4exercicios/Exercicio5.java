package modulo4exercicios;
import java.util.ArrayList;

public class Exercicio5 {
    public static void main(String[] args) {
        // Criação do ArrayList de strings representando números
        ArrayList<String> numerosString = new ArrayList<>();
        numerosString.add("10");
        numerosString.add("20");
        numerosString.add("abc");
        numerosString.add("30");
        numerosString.add("xyz");

        // Lista para armazenar os números convertidos com sucesso
        ArrayList<Integer> numerosConvertidos = new ArrayList<>();

        // Tentativa de conversão e tratamento de exceções
        for (String numeroStr : numerosString) {
            try {
                int numero = Integer.parseInt(numeroStr);
                numerosConvertidos.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter \"" + numeroStr + "\": não é um número válido.");
            }
        }

        // Imprimindo os números convertidos com sucesso
        System.out.println("Números convertidos com sucesso: " + numerosConvertidos);
    }
}
