package exercicio7;

public class Serra implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando a serra para cortar madeira.");
    }

    @Override
    public void manter() {
        System.out.println("Lubrificando e afiando a lâmina da serra.");
    }
}
