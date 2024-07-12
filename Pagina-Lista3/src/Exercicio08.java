package src;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago pelo cliente: ");
        double valorPago = scanner.nextDouble();

        double troco = valorPago - valorCompra;

        if (troco < 0) {
            System.out.println("O valor pago é insuficiente para cobrir o valor da compra.");
        } else {
            System.out.printf("Valor da compra: R$ %.2f%n", valorCompra);
            System.out.printf("Valor pago pelo cliente: R$ %.2f%n", valorPago);
            System.out.printf("Valor do troco: R$ %.2f%n", troco);

            int trocoCentavos = (int) Math.round(troco * 100);

            int[] notas = { 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10 };

            String[] nomesNotas = { "R$ 100,00", "R$ 50,00", "R$ 20,00", "R$ 10,00", "R$ 5,00", "R$ 2,00", "R$ 1,00",
                    "R$ 0,50", "R$ 0,20", "R$ 0,10" };

            for (int i = 0; i < notas.length; i++) {
                int quantidadeNotas = trocoCentavos / notas[i];
                if (quantidadeNotas > 0) {
                    System.out.printf("Quantidade de notas de %s: %d%n", nomesNotas[i], quantidadeNotas);
                    trocoCentavos %= notas[i];
                }
            }
        }

        scanner.close();
    }
}
