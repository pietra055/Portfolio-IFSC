
// Faça um programa que leia dois números, calcule e apresente o quadrado da soma destes números.
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, soma, quadradoDaSoma;

        System.out.println("Digite o primeiro número");
        num1 = input.nextInt();

        System.out.println("Digite o segundo número");
        num2 = input.nextInt();

        soma = num1 + num2;

        quadradoDaSoma = soma * soma;

        System.out.println("O quadrado da soma dos números que você digitou é: " + quadradoDaSoma);
    }
}
