package jogopalpitao;
public class Jogador {
    private String nome;
    private int pontos;

    public Jogador(String nome, int fichas) {
        this.nome = nome;
        this.pontos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }

    public void gastarFichas(int fichas) {
    }
}
