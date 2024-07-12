package src;
// Crie uma nova versão do programa da questão 1 para que ele mostre uma mensagem

// indicando se a residência está com consumo elevado de energia. A empresa considera
// consumo elevado de energia, se a residência consumir mais de de 70 quilowatts.

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do quilowatt de energia: ");
        double precoQuilowatt = scanner.nextDouble();

        System.out.print("Digite a quantidade gasta de quilowatts: ");
        double quantidadeGasta = scanner.nextDouble();

        double valorAPagarEmDia = precoQuilowatt * quantidadeGasta;

        double valorAPagarEmAtraso = valorAPagarEmDia * 1.10;

        if (quantidadeGasta > 70) {
            System.out.println("Aviso: Consumo elevado de energia!");
        }

        System.out.print("Você vai pagar a conta no dia (digite 'sim') ou em atraso (digite 'não')? ");
        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.printf("Valor a ser pago se a conta for paga no dia: R$ %.2f%n", valorAPagarEmDia);
        } else if (resposta.equalsIgnoreCase("não")) {
            System.out.printf("Valor a ser pago se a conta for paga em atraso: R$ %.2f%n", valorAPagarEmAtraso);
        } else {
            System.out.println("Resposta inválida. Por favor, digite 'sim' ou 'não'.");
        }

        System.out.printf("Comparação dos valores:%n");
        System.out.printf("Valor a ser pago se a conta for paga no dia: R$ %.2f%n", valorAPagarEmDia);
        System.out.printf("Valor a ser pago se a conta for paga em atraso: R$ %.2f%n", valorAPagarEmAtraso);

        scanner.close();
    }
}
