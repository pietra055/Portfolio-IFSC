import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        final int NUM_ALUNOS = 45;
        int[] idades = new int[NUM_ALUNOS];
        double[] alturas = new double[NUM_ALUNOS];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < NUM_ALUNOS; i++) {
            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            System.out.print("Digite a altura (em metros) do aluno " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();
        }

        int countMenor18 = 0;
        int somaIdadesMenor170 = 0;
        int countMenor170 = 0;
        double somaAlturasMais20 = 0;
        int countMais20 = 0;

        for (int i = 0; i < NUM_ALUNOS; i++) {
            if (idades[i] < 18) {
                countMenor18++;
            }
            if (alturas[i] < 1.70) {
                somaIdadesMenor170 += idades[i];
                countMenor170++;
            }
            if (idades[i] > 20) {
                somaAlturasMais20 += alturas[i];
                countMais20++;
            }
        }

        double mediaIdadeMenor170 = countMenor170 > 0 ? (double) somaIdadesMenor170 / countMenor170 : 0;

        double mediaAlturaMais20 = countMais20 > 0 ? somaAlturasMais20 / countMais20 : 0;

        System.out.println("Quantidade de alunos com menos de 18 anos: " + countMenor18);
        System.out.println("Idade média dos alunos com menos de 1,70m de altura: " + mediaIdadeMenor170);
        System.out.println("Altura média dos alunos com mais de 20 anos: " + mediaAlturaMais20);

        scanner.close();
    }
}
