package exercicio7;

public class Martelo implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando o martelo para pregar um prego.");
    }

    @Override
    public void manter() {
        System.out.println("Verificando e apertando a cabeça do martelo.");
    }
}
