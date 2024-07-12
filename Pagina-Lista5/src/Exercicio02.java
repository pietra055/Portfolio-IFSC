import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiroNumero, segundoNumero;

        System.out.print("Digite o primeiro número inteiro: ");
        primeiroNumero = scanner.nextInt();

        do {
            System.out.print("Digite o segundo número inteiro (maior que o primeiro): ");
            segundoNumero = scanner.nextInt();

            if (segundoNumero <= primeiroNumero) {
                System.out.println("O segundo número deve ser maior que o primeiro. Tente novamente.");
            }
        } while (segundoNumero <= primeiroNumero);

        int soma = primeiroNumero + segundoNumero;
        System.out.println("A soma dos números " + primeiroNumero + " e " + segundoNumero + " é: " + soma);

        scanner.close();
    }
}
