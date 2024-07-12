
//Um restaurante a quilo cobra R$39,00 por quilo de refeição. Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Obs.
// O prato vazio pesa 450 gramas.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        double pratoMontado, pratoVazio;

        System.out.println("Digite o peso do prato montado pelo cliente(em quilos)");
        pratoMontado = Double.parseDouble(scanner.nextLine());

        pratoVazio = 0.450;

        pratoMontado = (39 * pratoMontado) - pratoVazio;

        System.out.println("o valor total a pagar é: R$ " + df.format(pratoMontado));

    }

}
