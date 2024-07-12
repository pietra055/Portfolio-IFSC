
//Escreva um programa que receba um horário (horas, minutos e segundos) e determine quantos segundos ainda faltam para terminar o dia (considere o dia com 24 horas)
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe as horas, minutos e segundos do usuário
        System.out.println("Digite as horas:");
        int horas = scanner.nextInt();

        System.out.println("Digite os minutos:");
        int minutos = scanner.nextInt();

        System.out.println("Digite os segundos:");
        int segundos = scanner.nextInt();
    }
}
