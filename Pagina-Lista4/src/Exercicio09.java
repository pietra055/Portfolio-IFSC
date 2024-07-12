import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um número inteiro maior que zero (ou 0 para encerrar): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 0) {
                count++;
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                System.out.println("Número inválido! Por favor, digite um número maior que zero.");
            }
        }

        if (count > 0) {

            System.out.println("O maior número digitado: " + max);
            System.out.println("O menor número digitado: " + min);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        scanner.close();
    }
}
