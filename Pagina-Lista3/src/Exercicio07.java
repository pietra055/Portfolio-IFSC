package src;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double VELOCIDADE_DO_SOM = 340.0; // m/s

        System.out.print("Digite o tempo transcorrido entre ver o raio e ouvir o trovão (em segundos): ");
        double tempo = scanner.nextDouble();

        double distancia = VELOCIDADE_DO_SOM * tempo;

        boolean perigo = distancia < 200;

        System.out.printf("A distância de onde o raio caiu até você é: %.2f metros%n", distancia);
        if (perigo) {
            System.out.println("O raio representou perigo!");
        } else {
            System.out.println("O raio não representou perigo.");
        }

        scanner.close();
    }
}
