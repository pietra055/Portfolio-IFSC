import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe as horas, minutos e segundos do usuário
        System.out.println("Digite as horas:");
        int horas = scanner.nextInt();

        System.out.println("Digite os minutos:");
        int minutos = scanner.nextInt();

        System.out.println("Digite os segundos:");
        int segundos = scanner.nextInt();

        // Calcula o total de segundos desde o início do dia
        int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;

        // Exibe o total de segundos
        System.out.println("O total de segundos desde o início do dia é: " + totalSegundos);

        scanner.close();
    }
}
