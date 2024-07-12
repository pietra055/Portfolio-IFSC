import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu
            System.out.println("Menu de Opções:");
            System.out.println("1 - Inclusão de cliente");
            System.out.println("2 - Alteração de cliente");
            System.out.println("3 - Exclusão de cliente");
            System.out.println("4 - Visualização de cliente");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Inclusão de cliente selecionada.");
                    break;
                case 2:
                    System.out.println("Alteração de cliente selecionada.");
                    break;
                case 3:
                    System.out.println("Exclusão de cliente selecionada.");
                    break;
                case 4:
                    System.out.println("Visualização de cliente selecionada.");
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println();
        } while (opcao != 5);

        scanner.close();
    }
}
