/* Faça um programa que leia um número inteiro e apresente o quociente e o resto da
                divisão deste número por 2. */

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero, quociente, resto;

        System.out.println("Digite um numero inteiro para descobrir seu Quociente e seu Resto:");
        numero = input.nextInt();

        quociente = numero / 2;

        resto = numero % 2;

        System.out.printf("Numero: %d\nQuociente: %d\nResto: %d\n", numero, quociente, resto);

    }
}