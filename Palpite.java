package jogopalpitao;
public class Palpite {
    private Jogador jogador;
    private Time timeEscolhido;
    private int fichasApostadas;

    // Construtor correto para receber Jogador, Time e número de fichas
    public Palpite(Jogador jogador, Time timeEscolhido, int fichasApostadas) {
        this.jogador = jogador;
        this.timeEscolhido = timeEscolhido;
        this.fichasApostadas = fichasApostadas;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Time getTimeEscolhido() {
        return timeEscolhido;
    }

    public int calcularPontos(Time timeVencedor, int saldoGols) {
        if (timeVencedor.equals(timeEscolhido)) {
            return fichasApostadas * saldoGols;  // Fichas apostadas multiplicadas pelo saldo de gols
        }
        return 0;  // Caso o palpite esteja errado
    }
}
