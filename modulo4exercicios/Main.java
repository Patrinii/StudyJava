package modulo4exercicios;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.inicializa(5, 10); // Capacidade de 5 pessoas e 10 andares (excluindo o térreo)

        elevador.entra();
        elevador.entra();
        elevador.sobe();
        elevador.sobe();
        elevador.sai();
        elevador.sobe();
        elevador.desce();
        elevador.mostrarMemoria();
    }
}
