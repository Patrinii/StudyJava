package exercicio9;

public class Celular extends Dispositivo implements Eletronico {
    public Celular(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void ligar() {
        System.out.println("Celular " + marca + " " + modelo + " está ligando.");
    }

    @Override
    public void desligar() {
        System.out.println("Celular " + marca + " " + modelo + " está desligando.");
    }
}
