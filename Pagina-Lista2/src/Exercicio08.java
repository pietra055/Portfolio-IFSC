/* Crie um programa que leia um número inteiro que representa a
                quantidade de segundos de um vídeo. O programa deve calcular e apresentar quantas
                horas, minutos e segundos dura este vídeo. */

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int totalSegundos, segundos, minutos, horas;

        System.out.println("Digite um numero representado em SEGUNDOS, sera calculado a duração em horas e minutos.");
        totalSegundos = input.nextInt();

        horas = totalSegundos / 3600;
        minutos = (totalSegundos % 3600) / 60;
        segundos = (totalSegundos % 60);

        System.out.printf("horas: %dh\n minutos: %dm\nsegundos: %ds\n ", horas, minutos, segundos);

    }
}
