import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            System.out.print("Digite um número inteiro maior que zero (ou 0 para encerrar): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 0) {
                count++;
                sum += number;
            } else {
                System.out.println("Por favor, digite um número maior que zero.");
            }
        }

        // Calcula a média
        double average = (count > 0) ? (double) sum / count : 0;

        // Exibe os resultados
        System.out.println("Quantidade de números digitados: " + count);
        System.out.println("Soma de todos os números: " + sum);
        System.out.println("Média de todos os números: " + average);

        // Fecha o Scanner
        scanner.close();
    }
}
