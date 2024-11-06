package modulo3exercicios;
public class Exercicio1 {
    // Atributos da classe
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    // Construtor para inicializar os atributos
    public Exercicio1(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        // Configura o salário como 0.0 se o valor não for positivo
        this.salarioMensal = salarioMensal > 0 ? salarioMensal : 0.0;
    }

    // Métodos get e set para o primeiro nome
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    // Métodos get e set para o sobrenome
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    // Métodos get e set para o salário mensal
    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal > 0 ? salarioMensal : 0.0;
    }

    // Método para calcular o salário anual
    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    // Método para aplicar um aumento de 10% no salário mensal
    public void aplicarAumentoDezPorcento() {
        salarioMensal *= 1.10; // Aumenta o salário em 10%
    }

    // Main para testar a classe Empregado
    public static void main(String[] args) {
        // Criação de duas instâncias de Empregado
        Exercicio1 empregado1 = new Exercicio1("João", "Silva", 3000.0);
        Exercicio1 empregado2 = new Exercicio1("Maria", "Souza", 4000.0);

        // Exibe o salário anual de cada empregado
        System.out.println(empregado1.getPrimeiroNome() + " " + empregado1.getSobrenome() + " - Salário Anual: " + empregado1.getSalarioAnual());
        System.out.println(empregado2.getPrimeiroNome() + " " + empregado2.getSobrenome() + " - Salário Anual: " + empregado2.getSalarioAnual());

        // Aplica aumento de 10% para cada empregado
        empregado1.aplicarAumentoDezPorcento();
        empregado2.aplicarAumentoDezPorcento();

        // Exibe o salário anual de cada empregado após o aumento
        System.out.println("\nApós aumento de 10%:");
        System.out.println(empregado1.getPrimeiroNome() + " " + empregado1.getSobrenome() + " - Salário Anual: " + empregado1.getSalarioAnual());
        System.out.println(empregado2.getPrimeiroNome() + " " + empregado2.getSobrenome() + " - Salário Anual: " + empregado2.getSalarioAnual());
    }
}
