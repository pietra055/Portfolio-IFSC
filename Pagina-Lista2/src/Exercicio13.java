import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        double salario = 1500.00;
        double conta1 = 200.00;
        double conta2 = 120.00;
        double multa = 0.02;

        double multaConta1 = conta1 * multa;
        double multaConta2 = conta2 * multa;

        double totalConta1 = conta1 + multaConta1;
        double totalConta2 = conta2 + multaConta2;

        double totalPago = totalConta1 + totalConta2;

        double salarioRestante = salario - totalPago;

        // Exibe o resultado
        System.out.printf("O valor restante do salário de João é: R$ %.2f\n", salarioRestante);
    }
}
