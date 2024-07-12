import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu peso atual (em kg): ");
        double pesoInicial = input.nextDouble();

        if (pesoInicial <= 0) {
            System.out.println("Peso inválido. Por favor, digite um valor positivo.");
        } else {

            double pesoEngordar = pesoInicial * 1.15;

            double pesoEmagrecer = pesoInicial * 0.80;

            System.out.printf("Seu peso se engordar 15%% será: %.2f kg\n", pesoEngordar);
            System.out.printf("Seu peso se emagrecer 20%% será: %.2f kg\n", pesoEmagrecer);
        }

        input.close();
    }
}
