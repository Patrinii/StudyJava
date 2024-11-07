package modulo4exercicios;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) {
        // Criação do ArrayList de inteiros
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        // Adicionando 10 números aleatórios ao ArrayList
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(100)); // Números aleatórios de 0 a 99
        }

        // Imprimindo todos os elementos do ArrayList
        System.out.println("Elementos do ArrayList: " + numeros);

        // Removendo o número na terceira posição (índice 2)
        if (numeros.size() > 2) {
            numeros.remove(2);
            System.out.println("Após remover o terceiro elemento: " + numeros);
        } else {
            System.out.println("O ArrayList não tem elementos suficientes para remover a terceira posição.");
        }

        // Adicionando um novo número no início do ArrayList
        numeros.add(0, 50); // Adiciona o número 50 na primeira posição
        System.out.println("Após adicionar o número 50 no início: " + numeros);

        // Verificando se o número 15 está presente no ArrayList
        if (numeros.contains(15)) {
            System.out.println("O número 15 está presente no ArrayList.");
        } else {
            System.out.println("O número 15 não está presente no ArrayList.");
        }
    }
}
