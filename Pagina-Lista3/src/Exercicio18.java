package src;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 0 e 999: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 999) {
            System.out.println("Número fora do intervalo válido.");
        } else {

            int soma = somaDigitos(numero);

            System.out.println("A soma dos dígitos de " + numero + " é: " + soma);
        }

        scanner.close();
    }

    public static int somaDigitos(int numero) {

        int digitoCentenas = numero / 100;
        int digitoDezenas = (numero / 10) % 10;
        int digitoUnidades = numero % 10;

        int soma = digitoCentenas + digitoDezenas + digitoUnidades;
        return soma;
    }
}
