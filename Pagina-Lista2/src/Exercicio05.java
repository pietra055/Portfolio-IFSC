/*  Uma revendedora de carros paga a seus vendedores um salário fixo equivalente a dois
salários-mínimos, mais uma comissão de R$ 150,00 por carro vendido e mais uma
comissão de 5% do valor das vendas. Crie um programa que leia o valor do salário mínimo, quantos carros o vendedor vendeu ao longo do mês e o valor total das vendas.
Após ler os dados, o programa deve calcular e apresentar o valor do salário do
funcionário */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite a quantidade de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        double salarioFixo = 2 * salarioMinimo;

        double comissaoPorCarro = 150.0 * carrosVendidos;

        double comissaoSobreVendas = 0.05 * valorTotalVendas;

        double salarioTotal = salarioFixo + comissaoPorCarro + comissaoSobreVendas;

        System.out.printf("O salário total do funcionário é: R$ %.2f\n", salarioTotal);

        scanner.close();
    }
}
