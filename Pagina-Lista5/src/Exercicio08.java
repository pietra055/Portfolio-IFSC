import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cpf;
        double rendaMensal;
        char classeRenda;

        while (true) {

            System.out.print("Digite o CPF do contribuinte (ou '00' para encerrar): ");
            cpf = scanner.nextLine();

            if (cpf.equals("00")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.print("Digite a renda mensal do contribuinte: ");
            rendaMensal = scanner.nextDouble();

            scanner.nextLine();

            System.out.print("Digite a classe de renda (A, B, C, D ou E): ");
            classeRenda = scanner.nextLine().toUpperCase().charAt(0);

            double aliquota = 0;
            double valorDescontado = 0;

            switch (classeRenda) {
                case 'A':
                    aliquota = 0; // Isento
                    break;
                case 'B':
                    aliquota = 0.05; // 5%
                    break;
                case 'C':
                    aliquota = 0.1; // 10%
                    break;
                case 'D':
                    aliquota = 0.15; // 15%
                    break;
                case 'E':
                    aliquota = 0.2; // 20%
                    break;
                default:
                    System.out.println("Classe de renda inválida. Tente novamente.");
                    continue;
            }

            valorDescontado = rendaMensal * aliquota;

            System.out.printf("\nCPF: %s\n", cpf);
            System.out.printf("Alíquota aplicada: %.1f%%\n", aliquota * 100);
            System.out.printf("Valor a ser descontado: R$ %.2f\n", valorDescontado);
        }

        scanner.close();
    }
}
