package modulo4exercicios;
import java.util.ArrayList;

public class Exercicio3 {
    public static void main(String[] args) {
        // Criação do ArrayList de números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando 15 números ao ArrayList, incluindo números repetidos
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);
        numeros.add(30);
        numeros.add(35);
        numeros.add(40);
        numeros.add(45);
        numeros.add(50);
        numeros.add(15); // Número repetido
        numeros.add(60);
        numeros.add(25); // Número repetido
        numeros.add(70);
        numeros.add(80);
        numeros.add(90);

        // Imprimindo o ArrayList original
        System.out.println("ArrayList original: " + numeros);

        // Removendo todos os números pares do ArrayList
        numeros.removeIf(n -> n % 2 == 0);

        // Imprimindo o ArrayList resultante
        System.out.println("ArrayList após a remoção dos números pares: " + numeros);
    }
}
