package modulo2exercicios;
import java.util.Scanner;

public class Exercicio10 {
    
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha a quantidade de linhas/colunas para a bandeira (deve ser um número ímpar): ");
        int tamanho = scanner.nextInt();
        
        // Verifica se o número de linhas/colunas é ímpar para manter o padrão
        if (tamanho % 2 == 0) {
            System.out.println("Por favor, insira um número ímpar.");
            return;
        }

        System.out.println("Escolha a bandeira:");
        System.out.println("1. Brasil");
        System.out.println("2. Alemanha");
        System.out.println("3. Argentina");
        System.out.println("4. Bélgica");
        System.out.println("5. Inglaterra");
        System.out.println("6. Coreia do Sul");
        System.out.println("7. EUA");
        System.out.println("8. Catar");
        System.out.println("9. Japão");

        int escolha = scanner.nextInt();
        
        switch (escolha) {
            case 1: desenharBrasil(tamanho); break;
            case 2: desenharAlemanha(tamanho); break;
            case 3: desenharArgentina(tamanho); break;
            case 4: desenharBelgica(tamanho); break;
            case 5: desenharInglaterra(tamanho); break;
            case 6: desenharCoreiaDoSul(tamanho); break;
            case 7: desenharEUA(tamanho); break;
            case 8: desenharCatar(tamanho); break;
            case 9: desenharJapao(tamanho); break;
            default: System.out.println("Escolha inválida."); break;
        }

        scanner.close();
    }

    // Função para desenhar a bandeira do Brasil
    public static void desenharBrasil(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == tamanho / 2 && j >= tamanho / 4 && j <= 3 * tamanho / 4) {
                    desenharEComercial();
                } else if (i % 2 == 0 && j % 3 == 0) {
                    desenharPorcento();
                } else {
                    desenharAsterisco();
                }
            }
            System.out.println();
        }
    }

    // Funções para desenhar bandeiras específicas (exemplo: Alemanha)
    public static void desenharAlemanha(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i < tamanho / 3) {
                    desenharAsterisco();
                } else if (i < 2 * tamanho / 3) {
                    desenharPorcento();
                } else {
                    desenharEComercial();
                }
            }
            System.out.println();
        }
    }

    // Função para desenhar o caractere *
    public static void desenharAsterisco() {
        System.out.print("* ");
    }

    // Função para desenhar o caractere &
    public static void desenharEComercial() {
        System.out.print("& ");
    }

    // Função para desenhar o caractere %
    public static void desenharPorcento() {
        System.out.print("% ");
    }

    // Funções para outras bandeiras
    public static void desenharArgentina(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i >= tamanho / 4 && i < 3 * tamanho / 4 && j >= tamanho / 4 && j < 3 * tamanho / 4) {
                    desenharEComercial();
                } else if ((i + j) % 3 == 0) {
                    desenharPorcento();
                } else {
                    desenharAsterisco();
                }
            }
            System.out.println();
        }
    }

    public static void desenharBelgica(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (j < tamanho / 3) {
                    desenharAsterisco();
                } else if (j < 2 * tamanho / 3) {
                    desenharEComercial();
                } else {
                    desenharPorcento();
                }
            }
            System.out.println();
        }
    }

    public static void desenharInglaterra(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == j || i + j == tamanho - 1) {
                    desenharEComercial();
                } else {
                    desenharAsterisco();
                }
            }
            System.out.println();
        }
    }

    public static void desenharCoreiaDoSul(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == tamanho / 2 || j == tamanho / 2) {
                    desenharEComercial();
                } else if ((i + j) % 4 == 0) {
                    desenharPorcento();
                } else {
                    desenharAsterisco();
                }
            }
            System.out.println();
        }
    }

    public static void desenharEUA(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i < tamanho / 2 && j < tamanho / 2) {
                    desenharAsterisco();
                } else if (i < tamanho / 2) {
                    desenharDolar();
                } else {
                    desenharEComercial();
                }
            }
            System.out.println();
        }
    }

    public static void desenharCatar(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (j % 3 == 0) {
                    desenharEComercial();
                } else if (j % 3 == 1) {
                    desenharPorcento();
                } else {
                    desenharAsterisco();
                }
            }
            System.out.println();
        }
    }

    public static void desenharJapao(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (Math.abs(i - tamanho / 2) + Math.abs(j - tamanho / 2) <= tamanho / 4) {
                    desenharEComercial();
                } else {
                    desenharAsterisco();
                }
            }
            System.out.println();
        }
    }

    // Função para desenhar o caractere $
    public static void desenharDolar() {
        System.out.print("$ ");
    }
}
