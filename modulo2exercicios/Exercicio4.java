package modulo2exercicios;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados de entrada
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        int numeroDependentes = scanner.nextInt();

        System.out.print("Digite o salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();

        System.out.print("Digite a taxa de imposto já paga pelo funcionário: ");
        double impostoNormalPago = scanner.nextDouble();

        // Cálculo do imposto bruto
        double impostoBruto = 0.0;
        if (salarioFuncionario > 12 * salarioMinimo) {
            impostoBruto = 0.20 * salarioFuncionario; // 20% para mais de 12 salários mínimos
        } else if (salarioFuncionario > 5 * salarioMinimo) {
            impostoBruto = 0.08 * salarioFuncionario; // 8% para mais de 5 salários mínimos
        } // Se o salário for igual ou inferior a 5 salários mínimos, o imposto bruto é zero

        // Cálculo da restituição com base no número de dependentes
        double restituição = numeroDependentes * 0.02 * impostoBruto;

        // Imposto após a restituição
        double impostoLiquido = impostoBruto - restituição;

        // Aplicação da taxa adicional de 4% sobre o imposto bruto
        double taxaAdicional = 0.04 * impostoBruto;
        double impostoFinal = impostoLiquido + taxaAdicional;

        // Cálculo do valor final do imposto levando em conta o imposto já pago
        double impostoAPagar = impostoFinal - impostoNormalPago;
        
        // Exibindo o resultado
        if (impostoAPagar > 0) {
            System.out.printf("O imposto de renda a ser pago pelo funcionário é: R$ %.2f%n", impostoAPagar);
        } else {
            System.out.println("O funcionário não tem imposto a pagar ou já pagou todo o imposto devido.");
        }
        
        scanner.close();
    }
}
