import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeAluno;
        double rendaFamiliar, gastoAlimentacao, gastoAluguel, outrosGastos;
        String continuar;

        int countAlunos = 0;
        double totalGastoAluguel = 0;
        double totalGastoAluguelRendaSuperior2000 = 0;
        int countAlunosRendaSuperior2000 = 0;

        do {

            System.out.println("Digite os dados do aluno:");
            System.out.print("Nome: ");
            nomeAluno = scanner.nextLine();
            System.out.print("Renda mensal da família: ");
            rendaFamiliar = scanner.nextDouble();
            System.out.print("Gasto com alimentação: ");
            gastoAlimentacao = scanner.nextDouble();
            System.out.print("Gasto com aluguel: ");
            gastoAluguel = scanner.nextDouble();
            System.out.print("Outros gastos: ");
            outrosGastos = scanner.nextDouble();

            double gastoTotal = gastoAlimentacao + gastoAluguel + outrosGastos;
            double proporcaoAlimentacao = (gastoAlimentacao / rendaFamiliar) * 100;
            double proporcaoAluguel = (gastoAluguel / rendaFamiliar) * 100;

            System.out.println("\nInformações do aluno:");
            System.out.println("Nome: " + nomeAluno);
            System.out.println("Gasto total: R$ " + String.format("%.2f", gastoTotal));
            System.out.println(
                    "Proporção de gastos com alimentação: " + String.format("%.2f", proporcaoAlimentacao) + "%");
            System.out.println("Proporção de gastos com aluguel: " + String.format("%.2f", proporcaoAluguel) + "%");

            totalGastoAluguel += gastoAluguel;
            countAlunos++;

            if (rendaFamiliar > 2000) {
                totalGastoAluguelRendaSuperior2000 += gastoAluguel;
                countAlunosRendaSuperior2000++;
            }

            System.out.print("\nDeseja registrar mais algum aluno? (SIM ou NÃO): ");
            scanner.nextLine();
            continuar = scanner.nextLine().toUpperCase();
            System.out.println();

        } while (continuar.equals("SIM"));

        double gastoMedioAluguel = countAlunos > 0 ? totalGastoAluguel / countAlunos : 0;

        double gastoTotalMedioRendaSuperior2000 = countAlunosRendaSuperior2000 > 0
                ? totalGastoAluguelRendaSuperior2000 / countAlunosRendaSuperior2000
                : 0;

        System.out.println("Resumo estatístico:");
        System.out.println("Gasto médio com aluguel: R$ " + String.format("%.2f", gastoMedioAluguel));
        System.out.println("Gasto total médio dos alunos com renda superior a R$ 2000,00: R$ " +
                String.format("%.2f", gastoTotalMedioRendaSuperior2000));

        scanner.close();
    }
}
