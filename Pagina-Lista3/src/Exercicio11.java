package src;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número A: ");
        int numeroA = scanner.nextInt();

        System.out.print("Digite o número B: ");
        int numeroB = scanner.nextInt();

        if (numeroA == numeroB) {
            System.out.println("Os números A e B são iguais.");
        } else {
            System.out.println("Os números A e B não são iguais.");
        }

        scanner.close();
    }
}
