package src;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento da sala (m): ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura da sala (m): ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura da sala (m): ");
        double altura = scanner.nextDouble();

        double areaPiso = comprimento * largura;

        double areaParedes = 2 * (comprimento * altura) + 2 * (largura * altura);

        double volumeSala = comprimento * largura * altura;

        String tamanhoArCondicionado;
        if (volumeSala < 100) {
            tamanhoArCondicionado = "Pequeno";
        } else if (volumeSala <= 500) {
            tamanhoArCondicionado = "Médio";
        } else {
            tamanhoArCondicionado = "Grande";
        }

        System.out.printf("Área do piso da sala: %.2f m²%n", areaPiso);
        System.out.printf("Área total das paredes: %.2f m²%n", areaParedes);
        System.out.printf("Volume da sala: %.2f m³%n", volumeSala);
        System.out.printf("Tamanho do ar-condicionado a ser instalado: %s%n", tamanhoArCondicionado);

        scanner.close();
    }
}