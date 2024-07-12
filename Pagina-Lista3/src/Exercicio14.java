package src;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto do funcionário: R$ ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o número de dependentes do funcionário: ");
        int numDependentes = scanner.nextInt();

        final double INSS_PERCENTUAL = 0.11;
        final double IR_PERCENTUAL = 0.15;

        double descontoINSS = salarioBruto * INSS_PERCENTUAL;

        double baseIR = salarioBruto - descontoINSS;

        double descontoIR = baseIR * IR_PERCENTUAL;

        double auxilioDependente = numDependentes * 150.00;

        double salarioLiquido = salarioBruto - descontoINSS - descontoIR + auxilioDependente;

        System.out.printf("\nSalário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto INSS (11%%): R$ %.2f%n", descontoINSS);
        System.out.printf("Desconto Imposto de Renda (15%% sobre %.2f): R$ %.2f%n", baseIR, descontoIR);
        System.out.printf("Auxílio por dependente: R$ %.2f%n", auxilioDependente);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}
