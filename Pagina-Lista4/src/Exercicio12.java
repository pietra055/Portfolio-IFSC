import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite um número inteiro entre 3 e 20: ");
            n = scanner.nextInt();

            if (n < 3 || n > 20) {
                System.out.println("Número inválido! Por favor, digite um número entre 3 e 20.");
            }
        } while (n < 3 || n > 20);

        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        System.out.println("\nSérie de Fibonacci até o " + n + "º termo:");

        if (n >= 1) {
            System.out.print(fibonacci[0]);
        }
        if (n >= 2) {
            System.out.print(", " + fibonacci[1]);
        }
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(", " + fibonacci[i]);
        }
        System.out.println();

        scanner.close();
    }
}
