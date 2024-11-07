package exercicio9;

public class Main {
    public static void main(String[] args) {
        // Criação dos objetos Pessoa para Einstein e Newton
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        // Data atual (substitua por uma data atualizada conforme necessário)
        int diaAtual = 5;
        int mesAtual = 11;
        int anoAtual = 2024;

        // Cálculo das idades
        einstein.calculaIdade(diaAtual, mesAtual, anoAtual);
        newton.calculaIdade(diaAtual, mesAtual, anoAtual);

        // Exibição das idades
        System.out.println(einstein.informaNome() + " teria " + einstein.informaIdade() + " anos.");
        System.out.println(newton.informaNome() + " teria " + newton.informaIdade() + " anos.");
    }
}
