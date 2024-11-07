package exercicio2;

public class Carro implements Transporte {
    @Override
    public void mover() {
        System.out.println("O carro está se movendo.");
    }

    @Override
    public void parar() {
        System.out.println("O carro parou.");
    }
}
