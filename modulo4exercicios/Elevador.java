package modulo4exercicios;

import java.util.ArrayList;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;
    private ArrayList<String> memoriaAndares;

    // Método inicializa: inicializa a capacidade e o total de andares
    public void inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0; // Começa no térreo
        this.pessoasPresentes = 0; // Começa vazio
        this.memoriaAndares = new ArrayList<>();
    }

    // Método entra: acrescenta uma pessoa no elevador
    public void entra() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou. Pessoas presentes: " + pessoasPresentes);
        } else {
            System.out.println("Elevador cheio! Não é possível entrar.");
        }
    }

    // Método sai: remove uma pessoa do elevador
    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu. Pessoas presentes: " + pessoasPresentes);
            memoriaAndares.add("Andar " + andarAtual + ": 1 pessoa saiu.");
        } else {
            System.out.println("O elevador está vazio! Não há ninguém para sair.");
        }
    }

    // Método sobe: sobe um andar
    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu para o andar " + andarAtual);
            memoriaAndares.add("Andar " + andarAtual + ": subiu.");
        } else {
            System.out.println("Já está no último andar. Não pode subir.");
        }
    }

    // Método desce: desce um andar
    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para o andar " + andarAtual);
            memoriaAndares.add("Andar " + andarAtual + ": desceu.");
        } else {
            System.out.println("Já está no térreo. Não pode descer.");
        }
    }

    // Método para imprimir a memória de andares visitados e ações realizadas
    public void mostrarMemoria() {
        if (memoriaAndares.isEmpty()) {
            System.out.println("Nenhum registro de andares visitados.");
        } else {
            System.out.println("Memória de andares visitados:");
            for (String registro : memoriaAndares) {
                System.out.println(registro);
            }
        }
    }
}
