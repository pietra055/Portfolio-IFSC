import java.util.Scanner;

// 02 - Escreva um algoritmo para ler um número inteiro e imprimir na tela seu sucessor e seu antecessor.

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        System.out.println("seu numero : " + numero + ", o antecessor : " + (numero - 1) + ", seu sucessor : " + (numero + 1));

        input.close();

    }
}