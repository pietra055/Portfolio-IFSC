package src;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do candidato: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota em Português: ");
        double notaPortugues = scanner.nextDouble();

        System.out.print("Digite a nota em Matemática: ");
        double notaMatematica = scanner.nextDouble();

        System.out.print("Digite a nota em Conhecimentos Gerais: ");
        double notaGerais = scanner.nextDouble();

        System.out.println("\nDados do candidato:");
        System.out.println("Nome: " + nome);
        System.out.println("Nota em Português: " + notaPortugues);
        System.out.println("Nota em Matemática: " + notaMatematica);
        System.out.println("Nota em Conhecimentos Gerais: " + notaGerais);

        double media = (notaPortugues + notaMatematica + notaGerais) / 3;

        boolean aprovado = false;
        if (media > 7.0 && notaPortugues >= 5.0 && notaMatematica >= 5.0 && notaGerais >= 5.0) {
            aprovado = true;
        }

        System.out.printf("\nMédia do candidato: %.2f%n", media);
        if (aprovado) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }

        scanner.close();
    }
}
