package jogopalpitao;

import java.util.*;

public class Palpitao {

    public static void main(String[] args) {
        
        // Inicializando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar nomes dos jogadores
        System.out.print("Informe o nome do Jogador 1: ");
        String nomeJogador1 = scanner.nextLine();
        System.out.print("Informe o nome do Jogador 2: ");
        String nomeJogador2 = scanner.nextLine();
        
        // Criar jogadores com 50 fichas iniciais
        Jogador jogador1 = new Jogador(nomeJogador1, 50);
        Jogador jogador2 = new Jogador(nomeJogador2, 50);
        
        // Lista de jogadores
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(jogador1);
        jogadores.add(jogador2);
        
        // Perguntar o número de times
        System.out.print("Escolha o número de times para compor o campeonato (4 ou 8): ");
        int numeroDeTimes = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        
        // Criar lista de times
        List<Time> times = new ArrayList<>();
        for (int i = 1; i <= numeroDeTimes; i++) {
            System.out.print("Informe o nome do time " + i + ": ");
            String nomeTime = scanner.nextLine();
            Time time = new Time(nomeTime);
            times.add(time);
        }

        // Criar o campeonato e iniciar o jogo
        Campeonato campeonato = new Campeonato();
        campeonato.iniciarJogo();
        
        // Exibir o relatório final
        (campeonato).exibirRelatorioFinal();
        
        scanner.close();
    }
}
