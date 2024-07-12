//Crie um programa que leia as medidas da base e altura de um retângulo, calcule eapresente a área e o perímetro deste retângulo

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int base, altura, area, perimetro;

        System.out.println("digite a altura");
        altura = input.nextInt();

        System.out.println("digite a base");
        base = input.nextInt();

        area = altura * base;

        perimetro = (2 * base) + (2 * altura);

        System.out.println("Sua area e de: " + area + ", e perimetro equivalente a: " + perimetro);

    }

}
