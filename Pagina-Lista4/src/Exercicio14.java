import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMasculino = 0, countFeminino = 0, countIndefinido = 0;
        int countComExperiencia = 0, countSemExperiencia = 0;
        int somaIdadeComExperiencia = 0, somaIdadeSemExperiencia = 0;
        int idadeMaisJovem = Integer.MAX_VALUE;
        int totalCandidatos = 0;

        while (true) {

            System.out.print("Gênero (M/F/I/X para terminar): ");
            String genero = scanner.next().toUpperCase();

            if (genero.equals("X")) {
                break;
            }

            if (genero.equals("M")) {
                countMasculino++;
            } else if (genero.equals("F")) {
                countFeminino++;
            } else if (genero.equals("I")) {
                countIndefinido++;
            } else {
                System.out.println("Gênero inválido. Por favor, digite M, F ou I.");
                continue;
            }

            System.out.print("Experiência no serviço (S/N): ");
            char experiencia = scanner.next().toUpperCase().charAt(0);

            if (experiencia != 'S' && experiencia != 'N') {
                System.out.println("Opção de experiência inválida. Digite S ou N.");
                continue;
            }

            if (experiencia == 'S') {
                countComExperiencia++;
                System.out.print("Idade do candidato: ");
                int idade = scanner.nextInt();
                somaIdadeComExperiencia += idade;
                idadeMaisJovem = Math.min(idadeMaisJovem, idade);
            } else {
                countSemExperiencia++;
                System.out.print("Idade do candidato: ");
                int idade = scanner.nextInt();
                somaIdadeSemExperiencia += idade;
                idadeMaisJovem = Math.min(idadeMaisJovem, idade);
            }

            totalCandidatos++;
        }

        double mediaIdadeComExperiencia = countComExperiencia > 0
                ? (double) somaIdadeComExperiencia / countComExperiencia
                : 0;
        double mediaIdadeSemExperiencia = countSemExperiencia > 0
                ? (double) somaIdadeSemExperiencia / countSemExperiencia
                : 0;

        double percentualComExperienciaMenor35 = countComExperiencia > 0
                ? (double) countComExperiencia / totalCandidatos * 100
                : 0;

        System.out.println("\nEstatísticas dos Candidatos:");
        System.out.println("Quantidade de candidatos masculinos: " + countMasculino);
        System.out.println("Quantidade de candidatos femininos: " + countFeminino);
        System.out.println("Quantidade de candidatos indefinidos: " + countIndefinido);
        System.out.println("Quantidade de candidatos com experiência: " + countComExperiencia);
        System.out.println("Quantidade de candidatos sem experiência: " + countSemExperiencia);
        System.out.println("Idade média dos candidatos com experiência: " + mediaIdadeComExperiencia);
        System.out.println("Idade média dos candidatos sem experiência: " + mediaIdadeSemExperiencia);
        System.out.println("Percentual de candidatos com experiência e idade inferior a 35 anos: " +
                percentualComExperienciaMenor35 + "%");
        System.out.println("Idade do candidato mais jovem: " + idadeMaisJovem);

        scanner.close();
    }
}
