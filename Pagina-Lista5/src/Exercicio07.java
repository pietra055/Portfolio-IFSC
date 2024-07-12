import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continua;

        do {

            System.out.print("Digite o nome do hóspede: ");
            String nomeHospede = scanner.nextLine();

            char tipoApartamento;
            do {
                System.out.print("Digite o tipo do apartamento (A, B ou C): ");
                tipoApartamento = scanner.next().toUpperCase().charAt(0);
            } while (tipoApartamento != 'A' && tipoApartamento != 'B' && tipoApartamento != 'C');

            int numDiarias;
            do {
                System.out.print("Digite o número de diárias (maior que zero): ");
                numDiarias = scanner.nextInt();
            } while (numDiarias <= 0);

            double valorDiaria = 0;
            switch (tipoApartamento) {
                case 'A':
                    valorDiaria = 150.00;
                    break;
                case 'B':
                    valorDiaria = 100.00;
                    break;
                case 'C':
                    valorDiaria = 75.00;
                    break;
                default:
                    break;
            }

            double totalPagar = valorDiaria * numDiarias;

            System.out.println("\nConta final do hóspede:");
            System.out.println("Nome do hóspede: " + nomeHospede);
            System.out.println("Tipo do apartamento: " + tipoApartamento);
            System.out.printf("Valor total das diárias: R$ %.2f\n", totalPagar);

            System.out.print("\nDeseja cadastrar outro hóspede? (S/N): ");
            continua = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();

        } while (continua == 'S');

        scanner.close();
        System.out.println("\nPrograma encerrado.");
    }
}
