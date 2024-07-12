import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1, valor2;

        do {
            System.out.print("Digite o primeiro valor: ");
            valor1 = scanner.nextInt();

            System.out.print("Digite o segundo valor: ");
            valor2 = scanner.nextInt();

            if (valor1 != valor2) {
                System.out.println("Os valores informados são diferentes. Digite novamente.");
            }

        } while (valor1 != valor2);

        System.out.println("Os valores informados são iguais. Encerrando o programa.");
        scanner.close();
    }
}
