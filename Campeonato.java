package jogopalpitao;
import java.util.*;

public class Campeonato {
    private List<Time> times;
    private List<Jogador> jogadores;
    private List<Palpite> palpites;

    public Campeonato() {
        times = new ArrayList<>();
        jogadores = new ArrayList<>();
        palpites = new ArrayList<>();
    }

    public void iniciarJogo() {
        try (Scanner scanner = new Scanner(System.in)) {
            // Informar o nome dos jogadores
            System.out.print("Informe o nome do Jogador 1: ");
            String nomeJogador1 = scanner.nextLine();
            System.out.print("Informe o nome do Jogador 2: ");
            String nomeJogador2 = scanner.nextLine();

            Jogador jogador1 = new Jogador(nomeJogador1, 50);  // Jogador 1 com 50 fichas
            Jogador jogador2 = new Jogador(nomeJogador2, 50);  // Jogador 2 com 50 fichas

            jogadores.add(jogador1);
            jogadores.add(jogador2);

            // Boas-vindas ao jogador
            System.out.println("[Sistema] Seja bem-vindo " + jogador1.getNome() + " e " + jogador2.getNome() + ", vocês têm 50 fichas para palpitar nos seus times escolhidos.");

            // Solicitar o número de times
            System.out.print("[Sistema] Escolha o número de times para compor o campeonato (4 ou 8): ");
            int numTimes = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            // Criar os times
            for (int i = 0; i < numTimes; i++) {
                System.out.print("[Sistema] Informe o nome do time " + (i + 1) + ": ");
                String nomeTime = scanner.nextLine();
                Time time = new Time(nomeTime);
                times.add(time);
            }

            // Exibir a tabela de jogos
            System.out.println("[Sistema] Tabela de jogos");
            for (int i = 0; i < times.size(); i++) {
                for (int j = i + 1; j < times.size(); j++) {
                    Time time1 = times.get(i);
                    Time time2 = times.get(j);
                    System.out.println("[Sistema] " + time1.getNome() + " vs " + time2.getNome());

                    // Palpites dos jogadores para essa partida
                    for (Jogador jogador : jogadores) {
                        System.out.print(jogador.getNome() + ", qual time você acha que vai ganhar? (1 para " + time1.getNome() + " ou 2 para " + time2.getNome() + "): ");
                        int escolha = scanner.nextInt();
                        System.out.print("Quantas fichas você deseja apostar? ");
                        int fichas = scanner.nextInt();
                        scanner.nextLine();  // Limpar o buffer

                        // Registrar o palpite
                        Time timeEscolhido = (escolha == 1) ? time1 : time2;
                        Palpite palpite = new Palpite(jogador, timeEscolhido, fichas);
                        palpites.add(palpite);

                        // Subtrair as fichas do jogador
                        jogador.gastarFichas(fichas);
                    }
                }
            }
        }
    }

    public void computarResultados() {
        // Simulação de resultado da partida
        Random rand = new Random();
        for (Palpite palpite : palpites) {
            Time timeVencedor = rand.nextBoolean() ? palpite.getTimeEscolhido() : times.get(rand.nextInt(times.size()));  // Escolher aleatoriamente o vencedor
            int saldoGols = rand.nextInt(5) + 1;  // Gerar um saldo de gols aleatório para o time vencedor

            // Atribuir pontos ao jogador
            int pontos = palpite.calcularPontos(timeVencedor, saldoGols);
            palpite.getJogador().adicionarPontos(pontos);

            // Atribuindo pontos ao time vencedor
            if (timeVencedor.equals(palpite.getTimeEscolhido())) {
                timeVencedor.adicionarPontos(3);  // Vitória
            } else {
                timeVencedor.adicionarPontos(0);  // Derrota
            }
        }

        // Exibir os resultados
        System.out.println("Pontuação Final dos Jogadores:");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome() + " - Pontuação: " + jogador.getPontos());
        }

        // Exibir a classificação dos times
        System.out.println("\nClassificação dos Times:");
        times.sort(Comparator.comparingInt(Time::getPontos).reversed());
        for (Time time : times) {
            System.out.println(time.getNome() + " - Pontuação: " + time.getPontos());
        }

        // Classificação para Libertadores, Sul-Americana e Rebaixamento
        System.out.println("\nClassificação para Libertadores, Sul-Americana e Rebaixamento:");

        // 1º colocado vai para Libertadores
        Time timeLibertadores = times.get(0);
        System.out.println(timeLibertadores.getNome() + " vai para a Libertadores!");

        // Os times que não têm zero pontos e estão abaixo do campeão vão para a Sul-Americana
        for (int i = 1; i < times.size(); i++) {
            Time time = times.get(i);
            if (time.getPontos() > 0) {
                System.out.println(time.getNome() + " vai para a Sul-Americana!");
            }
        }

        // Rebaixamento (times com 0 pontos)
        for (Time time : times) {
            if (time.getPontos() == 0) {
                System.out.println(time.getNome() + " foi rebaixado.");
            }
        }
    }

    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();
        campeonato.iniciarJogo();
        campeonato.computarResultados();
    }

    public void exibirRelatorioFinal() {
        // TODO Auto-generated method stub
    }
}

