package jogopalpitao;
public class Time {
    private String nome;
    private int pontos;

    public Time(String nome) {
        this.nome = nome;
        this.pontos = 0;  // Inicializa com 0 pontos
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
}
