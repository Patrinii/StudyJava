package modulo3exercicios;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private List<Ingresso> ingressos;
    private List<Ingresso> ingressosVendidos;

    public Evento() {
        this.ingressos = new ArrayList<>();
        this.ingressosVendidos = new ArrayList<>();
    }

    // Adiciona um ingresso ao evento
    public void adicionarIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    // Venda de um ingresso
    public void venderIngresso(Ingresso ingresso) {
        if (ingressos.contains(ingresso)) {
            ingressosVendidos.add(ingresso);
            ingressos.remove(ingresso);
            System.out.println("Ingresso vendido: " + ingresso);
        } else {
            System.out.println("Ingresso não disponível para venda.");
        }
    }

    // Calcula o valor total dos ingressos vendidos
    public double calcularValorTotalVendas() {
        double total = 0;
        for (Ingresso ingresso : ingressosVendidos) {
            if (ingresso instanceof IngressoVIP) {
                total += ((IngressoVIP) ingresso).getValorTotal();
            } else {
                total += ingresso.getValor();
            }
        }
        return total;
    }

    // Exibe os ingressos que não foram vendidos
    public void mostrarIngressosDisponiveis() {
        if (ingressos.isEmpty()) {
            System.out.println("Não há ingressos disponíveis.");
        } else {
            System.out.println("Ingressos disponíveis:");
            for (Ingresso ingresso : ingressos) {
                System.out.println(ingresso);
            }
        }
    }
}
