package modulo4exercicios;

import java.util.ArrayList;

public class FiltragemArrayList {
    public static void main(String[] args) {
        // Criação do ArrayList de palavras
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("carro");
        palavras.add("programacao");
        palavras.add("java");
        palavras.add("desenvolvimento");
        palavras.add("livro");
        palavras.add("codigo");
        palavras.add("pessoa");
        palavras.add("ideia");
        palavras.add("teste");
        palavras.add("casa"); // Palavra repetida

        // Chamando o método para filtrar palavras com mais de 5 caracteres
        try {
            ArrayList<String> palavrasFiltradas = filtrarPalavras(palavras);
            System.out.println("Palavras com mais de 5 caracteres: " + palavrasFiltradas);
        } catch (NoMatchingElementsException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // Método para filtrar palavras com mais de 5 caracteres
    public static ArrayList<String> filtrarPalavras(ArrayList<String> palavras) throws NoMatchingElementsException {
        ArrayList<String> filtradas = new ArrayList<>();
        for (String palavra : palavras) {
            if (palavra.length() > 5) {
                filtradas.add(palavra);
            }
        }

        // Verifica se a lista filtrada está vazia e lança a exceção personalizada
        if (filtradas.isEmpty()) {
            throw new NoMatchingElementsException("Nenhuma palavra com mais de 5 caracteres foi encontrada.");
        }

        return filtradas;
    }
}
