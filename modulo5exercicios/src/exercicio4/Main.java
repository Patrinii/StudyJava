package exercicio4;

public class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        Forma retangulo = new Retangulo(4, 6);
        Forma quadrado = new Quadrado(3);
        Forma triangulo = new Triangulo(4, 7);

        Forma[] formas = {circulo, retangulo, quadrado, triangulo};

        for (Forma forma : formas) {
            forma.imprimirNome();
            System.out.println("Área: " + forma.calcularArea());
            System.out.println();
        }
    }
}
