package src;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância da viagem a ser percorrida (em Km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o consumo médio do carro (em Km/litro): ");
        double consumoMedio = scanner.nextDouble();

        System.out.print("Digite o preço do litro do combustível: R$ ");
        double precoLitro = scanner.nextDouble();

        double gastoCombustivel = (distancia / consumoMedio) * precoLitro;

        System.out.printf("O valor gasto com combustível na viagem será de R$ %.2f%n", gastoCombustivel);

        scanner.close();
    }
}
