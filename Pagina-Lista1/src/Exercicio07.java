import java.util.Scanner;

public class Exercicio07 {

    // Escreva um algoritmo para ler quatro números, calcular o quadrado de cada um
    // deles, somar tudo e mostrar o resultado
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int contador = 0;
        double somaDosQuadrados = 0;

        while (contador < 4) {
            System.out.println("Digite um número: ");
            double numero = input.nextDouble();
            somaDosQuadrados += numero * numero;
            contador++;
        }

        System.out.println("A soma dos quadrados é: " + somaDosQuadrados);

    }
}
