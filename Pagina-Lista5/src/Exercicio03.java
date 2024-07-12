import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        while (true) {
            System.out.print("Digite o nome da pessoa (ou '0' para sair): ");
            String nome = scanner.nextLine();

            // Verifica se o nome é "0" para sair do loop
            if (nome.equals("0")) {
                break;
            }

            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

            System.out.print("Digite o sexo da pessoa (M/F): ");
            char sexo = scanner.nextLine().charAt(0);

            contador++;

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Sexo: " + sexo);
            System.out.println();
        }

        System.out.println("Quantidade de repetições do algoritmo: " + contador);
        scanner.close();
    }
}
