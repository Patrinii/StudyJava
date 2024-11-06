package modulo3exercicios;
class Cliente {
    private String nome;
    private Agenda agenda;

    public Cliente(String nome, Agenda agenda) {
        this.nome = nome;
        this.agenda = agenda;
    }

    public void acessarAgenda() {
        System.out.println("Cliente: " + nome);
        agenda.imprimirAgenda();
    }
}
