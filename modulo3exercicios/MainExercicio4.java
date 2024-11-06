package modulo3exercicios;
public class MainExercicio4 {
    public static void main(String[] args) {
        // Criação de contatos
        Contato contato1 = new Contato(1234, "João Silva", "joao@example.com");
        Contato contato2 = new Contato(4567, "Maria Oliveira");
        Contato contato3 = new Contato(7890);
        Contato contato4 = new Contato("12345678");
        contato4.setCodigo(3456);

        // Verificação de preenchimento
        System.out.println("Contato 1 está totalmente preenchido? " + contato1.isPreenchido());

        // Duplica um contato e imprime
        Contato copiaContato1 = contato1.duplicar();
        System.out.println("Contato duplicado:");
        copiaContato1.imprimirContato();

        // Criação de agenda e cliente
        Agenda agenda = new Agenda("Trabalho", "Contatos de trabalho");
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);
        agenda.adicionarContato(contato4);

        Cliente cliente = new Cliente("Empresa ABC", agenda);
        cliente.acessarAgenda();
    }
}
