package src;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();

        if (A + B <= C) {
            System.out.println("A soma de A e B é menor ou igual a C.");
        } else {
            System.out.println("A soma de A e B não é menor ou igual a C.");
        }

        scanner.close();
    }
}
