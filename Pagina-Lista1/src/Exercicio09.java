
//Escreva um algoritmo que dada uma temperatura em Celsius ele faz a conversão para Fahreheit.
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva a temperatura em graus Celcius: ");
        int C = input.nextInt();

        float Fahreheit = (9 * C + 160) / 5;

        System.out.println("Sua temperatura em Celsius (" + C + "°)," + " Será " + Fahreheit + "° em Fahreheit.");

    }

}
