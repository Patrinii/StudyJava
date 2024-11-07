package exercicio2;

public class Bicicleta implements Transporte {
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo.");
    }

    @Override
    public void parar() {
        System.out.println("A bicicleta parou.");
    }
}
