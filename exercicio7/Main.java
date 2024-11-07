package exercicio7;

public class Main {
    public static void main(String[] args) {
        Ferramenta[] ferramentas = {
            new Martelo(),
            new Serra(),
            new ChaveDeFenda()
        };

        Oficina.testarFerramentas(ferramentas);
    }
}
