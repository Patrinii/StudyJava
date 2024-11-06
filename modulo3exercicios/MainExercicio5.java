package modulo3exercicios;
public class MainExercicio5 {
    public static void main(String[] args) {
        // Cria um evento
        Evento evento = new Evento();

        // Cria ingressos comuns e VIPs
        Ingresso ingresso1 = new Ingresso(100.0);
        IngressoVIP ingressoVIP1 = new IngressoVIP(100.0, 50.0);
        Ingresso ingresso2 = new Ingresso(120.0);
        IngressoVIP ingressoVIP2 = new IngressoVIP(120.0, 70.0);

        // Adiciona ingressos ao evento
        evento.adicionarIngresso(ingresso1);
        evento.adicionarIngresso(ingressoVIP1);
        evento.adicionarIngresso(ingresso2);
        evento.adicionarIngresso(ingressoVIP2);

        // Mostra ingressos disponíveis
        System.out.println("Antes das vendas:");
        evento.mostrarIngressosDisponiveis();

        // Vende alguns ingressos
        evento.venderIngresso(ingresso1);
        evento.venderIngresso(ingressoVIP1);

        // Exibe ingressos disponíveis após algumas vendas
        System.out.println("\nApós algumas vendas:");
        evento.mostrarIngressosDisponiveis();

        // Calcula o valor total dos ingressos vendidos
        System.out.println("\nValor total das vendas: R$ " + evento.calcularValorTotalVendas());
    }
}
