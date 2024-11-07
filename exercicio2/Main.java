package exercicio2;

public class Main {
    public static void main(String[] args) {
        Garagem garagem = new Garagem();

        Transporte carro = new Carro();
        Transporte bicicleta = new Bicicleta();

        garagem.adicionarTransporte(carro);
        garagem.adicionarTransporte(bicicleta);

        System.out.println("\nMovendo todos os transportes:");
        garagem.moverTodos();

        System.out.println("\nParando todos os transportes:");
        garagem.pararTodos();
    }
}
