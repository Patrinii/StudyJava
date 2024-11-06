package modulo3exercicios;

public class Contato {
    private int codigo;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private String observacao;

    // Construtor 1: Apenas código
    public Contato(int codigo) {
        setCodigo(codigo);
    }

    // Construtor 2: Código e nome
    public Contato(int codigo, String nome) {
        setCodigo(codigo);
        this.nome = nome;
    }

    // Construtor 3: Código, nome e e-mail
    public Contato(int codigo, String nome, String email) {
        setCodigo(codigo);
        this.nome = nome;
        setEmail(email);
    }

    // Construtor 4: Apenas telefone
    public Contato(String telefone) {
        setTelefone(telefone);
    }

    // Método para imprimir os dados do contato
    public void imprimirContato() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + (nome != null ? nome : "Não informado"));
        System.out.println("Endereço: " + (endereco != null ? endereco : "Não informado"));
        System.out.println("Email: " + (email != null ? email : "Não informado"));
        System.out.println("Telefone: " + (telefone != null ? telefone : "Não informado"));
        System.out.println("Observação: " + (observacao != null ? observacao : "Não informado"));
        System.out.println();
    }

    // Validação do código do contato
    void setCodigo(int codigo) {
        if (codigo >= 1000 && codigo <= 9999) {
            this.codigo = codigo;
        } else {
            System.out.println("Código inválido. Deve estar entre 1000 e 9999.");
            this.codigo = 0; // valor padrão para indicar código inválido
        }
    }

    // Validação do telefone (8 dígitos)
    private void setTelefone(String telefone) {
        if (telefone != null && telefone.length() == 8 && telefone.matches("\\d+")) {
            this.telefone = telefone;
        } else {
            System.out.println("Telefone inválido. Deve conter 8 dígitos.");
            this.telefone = ""; // valor padrão para indicar telefone inválido
        }
    }

    // Getter para o e-mail (não permite modificação externa)
    public String getEmail() {
        return email;
    }

    // Setter privado para e-mail (somente a classe Contato pode usá-lo)
    private void setEmail(String email) {
        this.email = email;
    }

    // Método para duplicar um contato
    public Contato duplicar() {
        Contato copia = new Contato(codigo);
        copia.nome = nome;
        copia.endereco = endereco;
        copia.email = email;
        copia.telefone = telefone;
        copia.observacao = observacao;
        return copia;
    }

    // Método para verificar se o contato está totalmente preenchido
    public boolean isPreenchido() {
        return codigo != 0 && nome != null && !nome.isEmpty() &&
               endereco != null && !endereco.isEmpty() &&
               email != null && !email.isEmpty() &&
               telefone != null && !telefone.isEmpty() &&
               observacao != null && !observacao.isEmpty();
    }
}
