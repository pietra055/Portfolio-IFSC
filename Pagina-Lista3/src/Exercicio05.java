package src;
// Crie uma nova o programa da questão anterior, para que ele considere a frequência do aluno.

// Agora, para ser aprovado o aluno precisa ter nota igual ou superior a sete no trabalho,
// nota igual ou superior a seis em pelo menos uma das provas e frequência igual ou
// superior a 75%. Além desta diferença, caso o aluno tenha nota seis no trabalho ele
// poderá ser aprovado, mas para isto precisa ter frequência igual ou superior a 90%.

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double notaProva2 = scanner.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = scanner.nextDouble();

        System.out.print("Digite a frequência do aluno (%): ");
        double frequencia = scanner.nextDouble();

        boolean trabalhoAprovado = notaTrabalho >= 7;
        boolean provaAprovada = notaProva1 >= 6 || notaProva2 >= 6;
        boolean frequenciaAprovada = frequencia >= 75;
        boolean trabalhoSeisAprovado = notaTrabalho == 6 && frequencia >= 90;

        if (trabalhoAprovado && provaAprovada && frequenciaAprovada) {
            System.out.println("Aluno aprovado.");
        } else if (trabalhoSeisAprovado && provaAprovada) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno não aprovado.");
        }

        scanner.close();
    }
}
