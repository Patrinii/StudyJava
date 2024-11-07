package exercicio10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transacao> transacoes = new ArrayList<>();

        Transacao transacaoCartao = new CartaoDeCredito(500);
        Transacao transacaoBoleto = new Boleto(1000);

        transacoes.add(transacaoCartao);
        transacoes.add(transacaoBoleto);

        for (Transacao transacao : transacoes) {
            transacao.executarTransacao();
            System.out.println(); // Linha em branco para separar as saídas
        }
    }
}
