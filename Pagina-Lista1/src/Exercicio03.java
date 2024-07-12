import java.util.Scanner;

// 03- Escreva um algoritmo para ler um nome, um endereço e um telefone e imprimi-los na tela.

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("digite um endereço: ");
        String endereco = input.nextLine();

        System.out.println("digite um telefone: ");
        int telefone = input.nextInt();

        System.out.print("seu nome: " + nome + ", seu endereço: " + endereco + " seu telefone: " +  telefone);


        input.close();

    }
}