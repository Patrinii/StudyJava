package modulo6exercicios;

public class Main {
    public static void main(String[] args) {
        SomDosAnimais somDosAnimais = new SomDosAnimais();

        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal pato = new Pato();

        somDosAnimais.emitirSom(cachorro);
        somDosAnimais.emitirSom(gato);
        somDosAnimais.emitirSom(pato);
    }
}
