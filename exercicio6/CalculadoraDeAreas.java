package exercicio6;

import java.util.List;

public class CalculadoraDeAreas {
    public static void imprimirAreas(List<Forma> formas) {
        for (Forma forma : formas) {
            System.out.println(forma.toString() + " tem área: " + forma.calcularArea());
        }
    }
}
