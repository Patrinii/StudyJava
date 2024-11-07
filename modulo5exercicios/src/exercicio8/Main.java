package exercicio8;

public class Main {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();

        // Testando as funcionalidades do controle remoto
        controle.ligarDesligar();
        controle.aumentarVolume();
        controle.aumentarCanal();
        controle.consultarStatus();
        controle.trocarCanal(5);
        controle.diminuirVolume();
        controle.mute();
        controle.consultarStatus();
        controle.ligarDesligar(); // Desligar a TV
    }
}
