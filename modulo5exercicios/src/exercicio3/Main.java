package exercicio3;

public class Main {
    public static void main(String[] args) {
        // Testando a classe ContaCorrente
        ContaCorrente conta1 = new ContaCorrente("Miguel", 1000);
        conta1.sacar(300);
        conta1.depositar(500);
        System.out.println(conta1);

        // Testando a classe ContaEspecial
        ContaEspecial contaEspecial = new ContaEspecial("Ana", 500, 1000);
        contaEspecial.sacar(1200); // Deve permitir saque até o limite
        contaEspecial.sacar(500);  // Excede o limite disponível
        System.out.println(contaEspecial);
    }
}
