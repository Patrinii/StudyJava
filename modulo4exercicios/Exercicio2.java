package modulo4exercicios;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio2 {
    public static void main(String[] args) {
        // Criação do ArrayList de números decimais
        ArrayList<Double> numeros = new ArrayList<>();

        // Adicionando 10 números ao ArrayList
        numeros.add(12.5);
        numeros.add(3.7);
        numeros.add(8.9);
        numeros.add(4.2);
        numeros.add(15.3);
        numeros.add(1.4);
        numeros.add(9.8);
        numeros.add(7.6);
        numeros.add(2.9);
        numeros.add(11.1);

        // Imprimindo o ArrayList original
        System.out.println("ArrayList original: " + numeros);

        // Ordenando o ArrayList em ordem crescente
        Collections.sort(numeros);
        System.out.println("ArrayList em ordem crescente: " + numeros);

        // Ordenando o ArrayList em ordem decrescente
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("ArrayList em ordem decrescente: " + numeros);
    }
}
