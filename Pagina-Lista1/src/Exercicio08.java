import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero < 0) {
            System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
        } else {
            double raizQuadrada = raizQuadrada(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + raizQuadrada);
        }

        scanner.close();
    }

    public static double raizQuadrada(double numero) {
        double estimativa = numero;
        double precisao = 0.00001; // Definindo a precisão desejada

        while ((estimativa - numero / estimativa) > precisao) {
            estimativa = (estimativa + numero / estimativa) / 2;
        }

        return estimativa;
    }
}
