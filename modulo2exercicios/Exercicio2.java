package modulo2exercicios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos números você deseja inserir? ");
        int tamanho = scanner.nextInt();
        int[] numeros = new int[tamanho];
        
        System.out.println("Insira os números:");
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Soma: " + calcularSoma(numeros));
        int[] maiorMenor = encontrarMaiorEMenor(numeros);
        System.out.println("Maior valor: " + maiorMenor[0]);
        System.out.println("Menor valor: " + maiorMenor[1]);
        System.out.println("Média: " + calcularMedia(numeros));
        System.out.println("Mediana: " + calcularMediana(numeros));
        System.out.println("Moda: " + calcularModa(numeros));
        
        scanner.close();
    }
    
    // a) Soma de todos os elementos do array
    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        return soma;
    }
    
    // b) Maior e menor valor no array
    public static int[] encontrarMaiorEMenor(int[] array) {
        int maior = array[0];
        int menor = array[0];
        
        for (int num : array) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        
        return new int[] {maior, menor};
    }
    
    // c) Média dos elementos
    public static double calcularMedia(int[] array) {
        return (double) calcularSoma(array) / array.length;
    }
    
    // d) Mediana dos elementos
    public static double calcularMediana(int[] array) {
        Arrays.sort(array);
        int meio = array.length / 2;
        if (array.length % 2 == 0) {
            return (array[meio - 1] + array[meio]) / 2.0;
        } else {
            return array[meio];
        }
    }
    
    // e) Moda dos elementos
    public static int calcularModa(int[] array) {
        Map<Integer, Integer> frequencia = new HashMap<>();
        for (int num : array) {
            frequencia.put(num, frequencia.getOrDefault(num, 0) + 1);
        }
        
        int moda = array[0];
        int maxContagem = 0;
        
        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            if (entry.getValue() > maxContagem) {
                moda = entry.getKey();
                maxContagem = entry.getValue();
            }
        }
        
        return moda;
    }
}
