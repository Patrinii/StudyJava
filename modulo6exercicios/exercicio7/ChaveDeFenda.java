package exercicio7;

public class ChaveDeFenda implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando a chave de fenda para apertar parafusos.");
    }

    @Override
    public void manter() {
        System.out.println("Limpando a ponta da chave de fenda.");
    }
}
