package modulo5exercicios;

public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento();

        // Adicionando ingressos ao evento
        evento.adicionarIngresso(new Ingresso(50.0));
        evento.adicionarIngresso(new Ingresso(60.0));
        evento.adicionarIngresso(new IngressoVIP(70.0, 30.0));
        evento.adicionarIngresso(new IngressoVIP(80.0, 50.0));

        // Mostrando todos os ingressos não vendidos inicialmente
        System.out.println("Ingressos disponíveis:");
        evento.mostrarIngressosNaoVendidos();

        // Vendendo alguns ingressos
        evento.venderIngresso(0);
        evento.venderIngresso(2);

        // Mostrando ingressos restantes após a venda
        System.out.println("\nIngressos restantes após a venda:");
        evento.mostrarIngressosNaoVendidos();

        // Calculando e mostrando o valor total vendido
        double totalVendido = evento.calcularValorTotalVendido();
        System.out.println("\nValor total dos ingressos vendidos: R$ " + totalVendido);
    }
}
