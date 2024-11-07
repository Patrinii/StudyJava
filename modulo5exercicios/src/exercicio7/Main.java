package exercicio7;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("Pedro Lima", "Rua E, 123", "5555-6666", 505, 3000, 12, 10000, 8);
        Vendedor vendedor2 = new Vendedor("Juliana Mendes", "Avenida F, 789", "7777-8888", 606, 4000, 10, 15000, 10);

        System.out.println(vendedor1);
        System.out.println(vendedor2);
    }
}
