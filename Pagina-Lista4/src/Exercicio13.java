import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String genero;
        int idade;
        char experiencia;
        boolean continuar = true;

        System.out.println("Cadastro de Candidatos a Emprego");
        System.out.println("Digite 'X' para encerrar o cadastro.");

        while (continuar) {

            System.out.print("\nGênero (M/F/I/X para terminar): ");
            genero = scanner.next().toUpperCase();

            if (genero.equals("X")) {
                continuar = false;
                break;
            }

            if (!genero.equals("M") && !genero.equals("F") && !genero.equals("I")) {
                System.out.println("Gênero inválido. Por favor, digite M, F ou I.");
                continue;
            }

            System.out.print("Idade: ");
            idade = scanner.nextInt();

            System.out.print("Experiência no serviço (S/N): ");
            experiencia = scanner.next().toUpperCase().charAt(0);

            if (experiencia != 'S' && experiencia != 'N') {
                System.out.println("Opção de experiência inválida. Digite S ou N.");
                continue;
            }

            System.out.println("\nDados do Candidato:");
            System.out.println("Gênero: " + genero);
            System.out.println("Idade: " + idade);
            System.out.println("Experiência no serviço: " + (experiencia == 'S' ? "Sim" : "Não"));
        }

        scanner.close();
    }
}
