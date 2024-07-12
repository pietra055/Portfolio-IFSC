package src;
// Faça um programa que leia o peso de uma pessoa (Kg) e sua altura (Metros), calcule e

// imprima o seu índice de massa corporal, usando a seguinte fórmula: IMC = Peso / Altura²
// Além do IMC, o programa deve mostrar se a pessoa está acima do peso ideal (IMC > 25)

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso (Kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura (Metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu Índice de Massa Corporal (IMC) é: %.2f%n", imc);

        if (imc > 25) {
            System.out.println("Você está acima do peso ideal.");
        } else {
            System.out.println("Você está dentro do peso ideal.");
        }

        scanner.close();
    }
}
