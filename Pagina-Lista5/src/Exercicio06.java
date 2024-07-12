import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        final int CAPACIDADE_CINEMA = 20;
        final int NUM_ESPECTADORES = CAPACIDADE_CINEMA;
        int[] idades = new int[NUM_ESPECTADORES];
        char[] opinioes = new char[NUM_ESPECTADORES];
        int quantidadeOtimo = 0;
        int somaIdadesRuim = 0;
        int contadorRuim = 0;
        int idadeMinima = Integer.MAX_VALUE;
        int idadeMaxima = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < NUM_ESPECTADORES; i++) {

            System.out.printf("Informe a idade do espectador %d: ", i + 1);
            idades[i] = scanner.nextInt();

            if (idades[i] < idadeMinima) {
                idadeMinima = idades[i];
            }
            if (idades[i] > idadeMaxima) {
                idadeMaxima = idades[i];
            }

            System.out.printf("Informe a opinião do espectador %d (A - Ótimo, B - Bom, C - Regular, D - Ruim): ",
                    i + 1);
            opinioes[i] = scanner.next().charAt(0);

            if (opinioes[i] == 'A') {
                quantidadeOtimo++;
            }

            if (opinioes[i] == 'D') {
                somaIdadesRuim += idades[i];
                contadorRuim++;
            }
        }

        scanner.close();

        double mediaIdadeRuim = contadorRuim > 0 ? (double) somaIdadesRuim / contadorRuim : 0.0;

        int diferencaIdade = idadeMaxima - idadeMinima;

        System.out.println("\nResultados:");
        System.out.printf("Quantidade de respostas Ótimo: %d\n", quantidadeOtimo);
        System.out.printf("Média de idade das pessoas que responderam Ruim: %.2f anos\n", mediaIdadeRuim);
        System.out.printf("Diferença de idade entre a pessoa mais velha e a mais nova: %d anos\n", diferencaIdade);
    }
}
