package modulo5exercicios;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private List<Ingresso> ingressos = new ArrayList<>();
    private List<Ingresso> ingressosVendidos = new ArrayList<>();

    public void adicionarIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    public void venderIngresso(int index) {
        if (index >= 0 && index < ingressos.size()) {
            ingressosVendidos.add(ingressos.get(index));
            ingressos.remove(index);
        } else {
            System.out.println("Ingresso inválido.");
        }
    }

    public double calcularValorTotalVendido() {
        double total = 0;
        for (Ingresso ingresso : ingressosVendidos) {
            total += ingresso.getValor();
        }
        return total;
    }

    public void mostrarIngressosNaoVendidos() {
        if (ingressos.isEmpty()) {
            System.out.println("Todos os ingressos foram vendidos.");
        } else {
            System.out.println("Ingressos não vendidos:");
            for (Ingresso ingresso : ingressos) {
                System.out.println(ingresso);
            }
        }
    }
}
