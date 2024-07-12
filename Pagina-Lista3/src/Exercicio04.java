package src;
//O sistema de avaliação de uma disciplina é composto de duas provas e um trabalho.

//Para ser aprovado, o aluno precisa ter nota igual ou superior a sete no trabalho e nota
//igual ou superior a seis em pelo menos uma das provas. Observe que não se deve
//calcular a média das notas. Faça um programa que leia as três notas do aluno e
//apresente se ele deve ser aprovado ou não.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double notaProva2 = scanner.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = scanner.nextDouble();

        boolean trabalhoAprovado = notaTrabalho >= 7;
        boolean provaAprovada = notaProva1 >= 6 || notaProva2 >= 6;

        if (trabalhoAprovado && provaAprovada) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno não aprovado.");
        }

        scanner.close();
    }
}
