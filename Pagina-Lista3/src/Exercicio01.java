package src;
// Crie um programa que leia o preço do quilowatt de energia e a quantidade gasta de

// quilowatts em uma residência. O programa deve calcular e imprimir o valor a ser pago
// pela residência caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga
// em atraso. Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da
// conta. O programa não deve perguntar se a conta será paga em atraso ou não, ele deve
// sempre calcular e apresentar os dois valores, para que o usuário analise a diferença e
// decida se vai pagar a conta em dia ou não

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do quilowatt de energia: ");
        double precoQuilowatt = scanner.nextDouble();

        System.out.print("Digite a quantidade gasta de quilowatts: ");
        double quantidadeGasta = scanner.nextDouble();

        double valorAPagarEmDia = precoQuilowatt * quantidadeGasta;

        double valorAPagarEmAtraso = valorAPagarEmDia * 1.10;

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
