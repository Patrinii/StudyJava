package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Garagem {
    private List<Transporte> transportes = new ArrayList<>();

    public void adicionarTransporte(Transporte t) {
        transportes.add(t);
        System.out.println("Transporte adicionado à garagem.");
    }

    public void moverTodos() {
        for (Transporte transporte : transportes) {
            transporte.mover();
        }
    }

    public void pararTodos() {
        for (Transporte transporte : transportes) {
            transporte.parar();
        }
    }
}
