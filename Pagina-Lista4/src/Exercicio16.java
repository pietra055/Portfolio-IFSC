import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int resultado = 0;

        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }

        System.out.println("O resultado da multiplicação " + num1 + " * " + num2 + " é: " + resultado);

        scanner.close();
    }
}
