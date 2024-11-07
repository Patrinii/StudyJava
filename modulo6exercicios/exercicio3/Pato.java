package exercicio3;

public class Pato implements Voar, Nadar {
    @Override
    public void decolar() {
        System.out.println("O pato está decolando e voando.");
    }

    @Override
    public void mergulhar() {
        System.out.println("O pato está mergulhando na água.");
    }
}
