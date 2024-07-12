//Faça um programa que leia dois números, calcule e apresente a soma dos quadrados destes números.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, somaDosQuadrados;

        System.out.println("Digite o primeiro número");
        num1 = input.nextInt();

        System.out.println("Digite o segundo número");
        num2 = input.nextInt();

        num1 = num1 * num1;
        num2 = num2 * num2;

        somaDosQuadrados = num1 + num2;

        System.out.println("A soma dos quadrados dos números que você digitou é: " + somaDosQuadrados);
    }
}