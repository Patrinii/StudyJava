package exercicio4;

public class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void imprimirNome() {
        System.out.println("Quadrado");
    }
}
