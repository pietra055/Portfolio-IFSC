/* Uma sorveteria vende três tipos de picolés. Sabendo-se que o picolé tipo 1 (chocolate) é vendido
 por R$ 1,50, o do tipo 2 (baunilha) por R$ 2,00 e o do tipo 3 (morango)por R$ 0,75, faça um programa que leia
a quantidade vendida de cada tipo de picolé e apresente o valor arrecadado com as
vendas de cada tipo de picolé e o valor total das vendas.  */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int QuantidadeChocolate, QuantidadeBaunilha, QuantidadeMorango;
        double VendasChocolate, VendasBaunilha, VendasMorango, total;

        System.out.println("digite quantos sorvetes de chocolate foram vendidos");
        QuantidadeChocolate = input.nextInt();

        System.out.println("digite quantos sorvetes de baunilha foram vendidos");
        QuantidadeBaunilha = input.nextInt();

        System.out.println("digite quantos sorvetes de morango foram vendidos");
        QuantidadeMorango = input.nextInt();

        VendasChocolate = QuantidadeChocolate * 1.50;

        VendasBaunilha = QuantidadeBaunilha * 2;

        VendasMorango = QuantidadeMorango * 0.75;

        total = VendasBaunilha + VendasChocolate + VendasMorango;

        System.out.println("voce realizou um total de " + QuantidadeChocolate
                + " vendas de sorvetes de chocolate, arrecadando um total de: R$" + VendasChocolate);
        System.out.println("voce realizou um total de " + QuantidadeBaunilha
                + " vendas de sorvetes de baunilha, arrecadando um total de: R$" + VendasBaunilha);
        System.out.println("voce realizou um total de " + QuantidadeMorango
                + " vendas de sorvetes de morango, arrecadando um total de: R$" + VendasMorango);
        System.out.println("Totalizando em vendas no dia: R$" + total);

    }
}
