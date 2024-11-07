package exercicio7;

public class Oficina {
    public static void testarFerramentas(Ferramenta[] ferramentas) {
        for (Ferramenta ferramenta : ferramentas) {
            ferramenta.usar();
            ferramenta.manter();
            System.out.println(); // Linha em branco para separar as saídas
        }
    }
}
