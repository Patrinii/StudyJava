package exercicio4;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Carlos", 10000);
        Funcionario analista = new Analista("Ana", 8000);

        System.out.println("Gerente " + gerente.getNome() + " tem um bônus de: R$ " + gerente.calcularBonus());
        System.out.println("Analista " + analista.getNome() + " tem um bônus de: R$ " + analista.calcularBonus());
    }
}
