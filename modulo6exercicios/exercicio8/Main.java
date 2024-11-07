package exercicio8;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de ContaPoupanca e ContaCorrente
        ContaBancaria contaPoupanca = new ContaPoupanca(1000, 0.05); // 5% de rendimento
        ContaBancaria contaCorrente = new ContaCorrente(1500);

        // Testando métodos depositar() e calcularRendimento()
        System.out.println("\nConta Poupança:");
        contaPoupanca.depositar(500);
        contaPoupanca.calcularRendimento();

        System.out.println("\nConta Corrente:");
        contaCorrente.depositar(300);
        contaCorrente.calcularRendimento();
    }
}
