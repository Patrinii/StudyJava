package exercicio8;

public class ControleRemoto {
    private boolean ligada;
    private int volume;
    private int canal;

    public ControleRemoto() {
        this.ligada = false; // TV começa desligada
        this.volume = 10; // Volume inicial
        this.canal = 1; // Canal inicial
    }

    public void ligarDesligar() {
        ligada = !ligada;
        System.out.println(ligada ? "A TV está ligada." : "A TV está desligada.");
    }

    public void aumentarVolume() {
        if (ligada) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("A TV está desligada. Não é possível aumentar o volume.");
        }
    }

    public void diminuirVolume() {
        if (ligada) {
            if (volume > 0) {
                volume--;
                System.out.println("Volume diminuído para: " + volume);
            } else {
                System.out.println("O volume já está no mínimo.");
            }
        } else {
            System.out.println("A TV está desligada. Não é possível diminuir o volume.");
        }
    }

    public void aumentarCanal() {
        if (ligada) {
            canal++;
            System.out.println("Canal aumentado para: " + canal);
        } else {
            System.out.println("A TV está desligada. Não é possível mudar o canal.");
        }
    }

    public void diminuirCanal() {
        if (ligada) {
            if (canal > 1) {
                canal--;
                System.out.println("Canal diminuído para: " + canal);
            } else {
                System.out.println("O canal já está no mínimo.");
            }
        } else {
            System.out.println("A TV está desligada. Não é possível mudar o canal.");
        }
    }

    public void trocarCanal(int novoCanal) {
        if (ligada) {
            if (novoCanal > 0) {
                canal = novoCanal;
                System.out.println("Canal trocado para: " + canal);
            } else {
                System.out.println("Número de canal inválido.");
            }
        } else {
            System.out.println("A TV está desligada. Não é possível trocar o canal.");
        }
    }

    public void consultarStatus() {
        if (ligada) {
            System.out.println("Volume atual: " + volume + ", Canal atual: " + canal);
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void mute() {
        if (ligada) {
            volume = 0;
            System.out.println("TV no modo mute. Volume: " + volume);
        } else {
            System.out.println("A TV está desligada. Não é possível usar o mute.");
        }
    }
}
