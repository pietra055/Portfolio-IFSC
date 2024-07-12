package src;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os preços das mercadorias no dia 01/01/2022:");
        double precoMercadoria1Janeiro = lerPreco(scanner, "Mercadoria 1");
        double precoMercadoria2Janeiro = lerPreco(scanner, "Mercadoria 2");
        double precoMercadoria3Janeiro = lerPreco(scanner, "Mercadoria 3");

        System.out.println("\nInforme os preços das mercadorias no dia 01/02/2022:");
        double precoMercadoria1Fevereiro = lerPreco(scanner, "Mercadoria 1");
        double precoMercadoria2Fevereiro = lerPreco(scanner, "Mercadoria 2");
        double precoMercadoria3Fevereiro = lerPreco(scanner, "Mercadoria 3");

        double inflacaoMercadoria1 = calcularVariacao(precoMercadoria1Janeiro, precoMercadoria1Fevereiro);
        double inflacaoMercadoria2 = calcularVariacao(precoMercadoria2Janeiro, precoMercadoria2Fevereiro);
        double inflacaoMercadoria3 = calcularVariacao(precoMercadoria3Janeiro, precoMercadoria3Fevereiro);

        double inflacaoMedia = (inflacaoMercadoria1 + inflacaoMercadoria2 + inflacaoMercadoria3) / 3.0;

        double metaInflacao = 0.55; // Meta de inflação de 0,55%
        if (inflacaoMedia > metaInflacao) {
            System.out.println("\nInflação acima da meta para o mês: " + metaInflacao + "%");
        } else {
            System.out.println("\nInflação dentro da meta para o mês: " + metaInflacao + "%");
        }

        scanner.close();
    }

    private static double lerPreco(Scanner scanner, String nomeMercadoria) {
        System.out.print("Digite o preço da " + nomeMercadoria + ": R$ ");
        return scanner.nextDouble();
    }

    private static double calcularVariacao(double precoAnterior, double precoAtual) {
        return ((precoAtual - precoAnterior) / precoAnterior) * 100.0;
    }
}
