import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para digitar um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Exibe a tabuada do número digitado
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Fecha o Scanner
        scanner.close();
    }
}
