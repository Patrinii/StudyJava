package exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Eletronico> eletronicos = new ArrayList<>();

        Eletronico celular = new Celular("Samsung", "Galaxy S21");
        Eletronico tablet = new Tablet("Apple", "iPad Pro");

        eletronicos.add(celular);
        eletronicos.add(tablet);

        for (Eletronico eletronico : eletronicos) {
            eletronico.ligar();
            eletronico.desligar();
            System.out.println(); // Linha em branco para separar as saídas
        }
    }
}
