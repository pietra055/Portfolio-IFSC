import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite inferior do intervalo (em Celsius): ");
        double limiteInferior = scanner.nextDouble();

        System.out.print("Digite o limite superior do intervalo (em Celsius): ");
        double limiteSuperior = scanner.nextDouble();

        System.out.print("Digite o incremento desejado (em Celsius): ");
        double incremento = scanner.nextDouble();

        System.out.println("\nTabela de Conversão de Celsius para Fahrenheit");
        System.out.println("------------------------------------------");
        System.out.println("Celsius \t Fahrenheit");
        System.out.println("------------------------------------------");

        for (double celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {

            double fahrenheit = celsius * 9 / 5 + 32;

            System.out.printf("%.2f \t\t %.2f\n", celsius, fahrenheit);
        }

        scanner.close();
    }
}
