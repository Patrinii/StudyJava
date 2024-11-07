package modulo4exercicios;
import java.util.ArrayList;

public class UsoDeArrayListComObjetos4 {
    public static void main(String[] args) {
        // Criação do ArrayList de objetos Produto
        ArrayList<Produto> produtos = new ArrayList<>();

        // Adicionando pelo menos 5 objetos Produto ao ArrayList
        produtos.add(new Produto("Produto 1", 150.0));
        produtos.add(new Produto("Produto 2", 250.0));
        produtos.add(new Produto("Produto 3", 120.0));
        produtos.add(new Produto("Produto 4", 300.0));
        produtos.add(new Produto("Produto 5", 180.0));

        // Chamando o método para encontrar o produto mais caro
        try {
            String produtoMaisCaro = encontrarProdutoMaisCaro(produtos);
            System.out.println("O produto mais caro é: " + produtoMaisCaro);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // Método para encontrar o produto mais caro no ArrayList
    public static String encontrarProdutoMaisCaro(ArrayList<Produto> produtos) throws Exception {
        if (produtos.isEmpty()) {
            throw new Exception("O ArrayList está vazio. Não é possível encontrar o produto mais caro.");
        }

        Produto maisCaro = produtos.get(0);
        for (Produto produto : produtos) {
            if (produto.getPreco() > maisCaro.getPreco()) {
                maisCaro = produto;
            }
        }
        return maisCaro.getNome();
    }
}
