package exercicio2;

public class Main {
    public static void main(String[] args) {
        // Testando a classe Empregado
        Empregado empregado = new Empregado("Carlos", 4000);
        System.out.println(empregado);

        // Testando a classe Gerente
        Gerente gerente = new Gerente("Maria", 6000, "Recursos Humanos");
        System.out.println(gerente);

        // Testando a classe Vendedor
        Vendedor vendedor = new Vendedor("Felipe", 3500, 10); // 10% de comissão
        System.out.println(vendedor);
    }
}
