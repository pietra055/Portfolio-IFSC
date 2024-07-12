import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a quantidade de funcionários
        System.out.print("Digite o número de funcionários: ");
        int numFuncionarios = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha

        String[] nomes = new String[numFuncionarios];
        char[] categorias = new char[numFuncionarios];
        double[] salarios = new double[numFuncionarios];

        // Lê os dados de cada funcionário
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Digite a categoria do funcionário " + (i + 1) + ": ");
            categorias[i] = scanner.nextLine().charAt(0);
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salarios[i] = scanner.nextDouble();
            scanner.nextLine(); // Consome a nova linha
        }

        // Processa e exibe os dados reajustados de cada funcionário
        for (int i = 0; i < numFuncionarios; i++) {
            double salarioReajustado = calcularReajuste(categorias[i], salarios[i]);
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Categoria: " + categorias[i]);
            System.out.println("Salário reajustado: R$ " + String.format("%.2f", salarioReajustado));
            System.out.println();
        }

        // Fecha o Scanner
        scanner.close();
    }

    // Função que calcula o reajuste de acordo com a categoria
    public static double calcularReajuste(char categoria, double salario) {
        double porcentagemAumento;

        switch (categoria) {
            case 'A':
                porcentagemAumento = 0.10;
                break;
            case 'B':
                porcentagemAumento = 0.12;
                break;
            case 'C':
                porcentagemAumento = 0.14;
                break;
            case 'D':
                porcentagemAumento = 0.16;
                break;
            case 'E':
                porcentagemAumento = 0.18;
                break;
            case 'F':
                porcentagemAumento = 0.20;
                break;
            case 'G':
                porcentagemAumento = 0.22;
                break;
            case 'H':
                porcentagemAumento = 0.24;
                break;
            case 'I':
                porcentagemAumento = 0.26;
                break;
            case 'J':
                porcentagemAumento = 0.28;
                break;
            default:
                porcentagemAumento = 0.30;
                break;
        }

        return salario * (1 + porcentagemAumento);
    }
}
