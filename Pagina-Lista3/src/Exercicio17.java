package src;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a data de nascimento:");
        System.out.print("Dia: ");
        int diaNascimento = scanner.nextInt();
        System.out.print("Mês: ");
        int mesNascimento = scanner.nextInt();
        System.out.print("Ano: ");
        int anoNascimento = scanner.nextInt();

        System.out.println("\nInforme a data atual:");
        System.out.print("Dia: ");
        int diaAtual = scanner.nextInt();
        System.out.print("Mês: ");
        int mesAtual = scanner.nextInt();
        System.out.print("Ano: ");
        int anoAtual = scanner.nextInt();

        int diasVividos = calcularDiasVividos(diaNascimento, mesNascimento, anoNascimento, diaAtual, mesAtual,
                anoAtual);

        System.out.println("\nDias vividos até a data atual: " + diasVividos + " dias.");

        scanner.close();
    }

    public static int calcularDiasVividos(int diaNascimento, int mesNascimento, int anoNascimento,
            int diaAtual, int mesAtual, int anoAtual) {
        // considerando cada ano com 360 dias e cada mes com 30.
        int diasNascimento = anoNascimento * 360 + mesNascimento * 30 + diaNascimento;
        int diasAtual = anoAtual * 360 + mesAtual * 30 + diaAtual;

        return diasAtual - diasNascimento;
    }
}
