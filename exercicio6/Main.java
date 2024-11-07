package exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        
        formas.add(new Circulo(5));
        formas.add(new Retangulo(4, 7));
        formas.add(new Circulo(3));
        formas.add(new Retangulo(6, 2));

        CalculadoraDeAreas.imprimirAreas(formas);
    }
}
