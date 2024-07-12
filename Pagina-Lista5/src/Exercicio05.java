import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        final int NUM_FICHAS = 10;

        double maiorAltura = 0.0;
        double somaAlturasMulheres = 0.0;
        double somaAlturasTurma = 0.0;
        int countMulheres = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= NUM_FICHAS; i++) {

            System.out.printf("Digite a altura da pessoa %d (em metros): ", i);
            double altura = scanner.nextDouble();

            System.out.printf("Digite o código do sexo da pessoa %d (1 - masculino, 2 - feminino): ", i);
            int codigoSexo = scanner.nextInt();

            somaAlturasTurma += altura;
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (codigoSexo == 2) {
                somaAlturasMulheres += altura;
                countMulheres++;
            }
        }

        scanner.close();

        double mediaAlturasMulheres = countMulheres > 0 ? somaAlturasMulheres / countMulheres : 0.0;
        double mediaAlturasTurma = somaAlturasTurma / NUM_FICHAS;

        System.out.printf("Maior altura da turma: %.2f metros\n", maiorAltura);
        System.out.printf("Média de altura das mulheres: %.2f metros\n", mediaAlturasMulheres);
        System.out.printf("Média de altura da turma: %.2f metros\n", mediaAlturasTurma);
    }
}
