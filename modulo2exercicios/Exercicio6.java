package modulo2exercicios;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da massa inicial
        System.out.print("Digite a massa inicial do material em gramas: ");
        double massaInicial = scanner.nextDouble();

        // Variáveis de controle
        double massaAtual = massaInicial;
        int tempoSegundos = 0;

        // Cálculo do tempo necessário para que a massa seja menor que 0,5 grama
        while (massaAtual >= 0.5) {
            massaAtual /= 2; // Perde metade da massa
            tempoSegundos += 50; // Incrementa 50 segundos
        }

        // Cálculo do tempo em horas, minutos e segundos
        int horas = tempoSegundos / 3600;
        int minutos = (tempoSegundos % 3600) / 60;
        int segundos = tempoSegundos % 60;

        // Exibindo os resultados
        System.out.printf("Massa inicial: %.2f gramas\n", massaInicial);
        System.out.printf("Massa final: %.2f gramas\n", massaAtual);
        System.out.printf("Tempo necessário: %d horas, %d minutos, %d segundos\n", horas, minutos, segundos);

        scanner.close();
    }
}
