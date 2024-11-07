package exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pagavel> pagaveis = new ArrayList<>();

        Pagavel empregado = new Empregado("João", "123456789", 3000);
        Pagavel fornecedor = new Fornecedor("Empresa ABC", "987654321", 15000);

        pagaveis.add(empregado);
        pagaveis.add(fornecedor);

        for (Pagavel pagavel : pagaveis) {
            System.out.println("Pagamento de " + ((Pessoa) pagavel).getNome() + ": R$ " + pagavel.calcularPagamento());
        }
    }
}
