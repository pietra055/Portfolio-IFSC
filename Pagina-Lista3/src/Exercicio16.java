package src;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade total de parcelas do consórcio: ");
        int totalParcelas = scanner.nextInt();

        System.out.print("Digite a quantidade de parcelas já pagas: ");
        int parcelasPagas = scanner.nextInt();

        System.out.print("Digite o valor de cada parcela: R$ ");
        double valorParcela = scanner.nextDouble();

        double totalPago = parcelasPagas * valorParcela;

        double saldoDevedor = (totalParcelas - parcelasPagas) * valorParcela;

        System.out.printf("\nTotal já pago pelo cliente: R$ %.2f%n", totalPago);
        System.out.printf("Saldo devedor: R$ %.2f%n", saldoDevedor);

        scanner.close();
    }
}
