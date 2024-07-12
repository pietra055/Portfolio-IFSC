/*Uma pessoa foi ao supermercado e comprou:
                Q quilos de café, cujo custo unitário é X;
                L litros de leite, cujo custo unitário é Y;
                B pacotes de bolacha, cujo custo unitário é Z.
                Faça um programa que leia estes dados e imprima, para cada produto: nome do produto,
                total gasto com ele. Além disto, ele deve apresentar o total gasto na compra */

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de quilos de café: ");
        double quantidadeCafe = scanner.nextDouble();

        System.out.print("Digite o custo unitário do café: ");
        double custoCafe = scanner.nextDouble();

        System.out.print("Digite a quantidade de litros de leite: ");
        double quantidadeLeite = scanner.nextDouble();

        System.out.print("Digite o custo unitário do leite: ");
        double custoLeite = scanner.nextDouble();

        System.out.print("Digite a quantidade de pacotes de bolacha: ");
        int quantidadeBolacha = scanner.nextInt();

        System.out.print("Digite o custo unitário da bolacha: ");
        double custoBolacha = scanner.nextDouble();

        double totalCafe = quantidadeCafe * custoCafe;
        double totalLeite = quantidadeLeite * custoLeite;
        double totalBolacha = quantidadeBolacha * custoBolacha;

        double totalGeral = totalCafe + totalLeite + totalBolacha;

        System.out.printf("Total gasto com café: R$ %.2f\n", totalCafe);
        System.out.printf("Total gasto com leite: R$ %.2f\n", totalLeite);
        System.out.printf("Total gasto com bolacha: R$ %.2f\n", totalBolacha);

        System.out.printf("Total gasto na compra: R$ %.2f\n", totalGeral);

    }
}
