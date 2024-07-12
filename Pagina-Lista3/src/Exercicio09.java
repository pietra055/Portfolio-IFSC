package src;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da pista (em Km): ");
        double tamanhoPista = scanner.nextDouble();

        System.out.print("Digite o peso do avião (em toneladas): ");
        double pesoAviao = scanner.nextDouble();

        System.out.print("Digite a visibilidade (em metros): ");
        int visibilidade = scanner.nextInt();

        System.out.print("Digite a intensidade da chuva (em mm, digite 0 se não estiver chovendo): ");
        double intensidadeChuva = scanner.nextDouble();

        System.out.print("Digite o número de passageiros: ");
        int numPassageiros = scanner.nextInt();

        System.out.print("O avião possui sistema de decolagem automatizada? (sim/não): ");
        boolean possuiSistemaAutomatizado = scanner.next().equalsIgnoreCase("sim");

        boolean podeDecolar = true;

        if (tamanhoPista < 1.5) {
            if (pesoAviao >= 40) {
                podeDecolar = false;
            }
        } else if (tamanhoPista >= 1.5 && tamanhoPista <= 2) {
            if (pesoAviao > 60) {
                podeDecolar = false;
            }
        }

        if (visibilidade < 20 && !possuiSistemaAutomatizado) {
            podeDecolar = false;
        }

        if (intensidadeChuva > 5) {
            podeDecolar = false;
        }

        if (numPassageiros > 100 && intensidadeChuva > 0) {
            podeDecolar = false;
        }

        if (podeDecolar) {
            System.out.println("O avião pode decolar.");
        } else {
            System.out.println("O avião não pode decolar.");
        }

        scanner.close();
    }
}
