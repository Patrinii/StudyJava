package modulo3exercicios;

import java.util.ArrayList;
import java.util.List;

class Agenda {
    private String nome;
    private String descricao;
    private List<Contato> contatos;

    public Agenda(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void imprimirAgenda() {
        System.out.println("Agenda: " + nome);
        System.out.println("Descrição: " + descricao);
        for (Contato contato : contatos) {
            contato.imprimirContato();
        }
    }
}
