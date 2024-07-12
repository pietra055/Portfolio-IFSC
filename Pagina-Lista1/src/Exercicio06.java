import java.util.Scanner;

//Escreva um algoritmo para calcular o quadrado de um número, ou seja, o produto de um número por si mesmo.

public class Exercicio06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double numero,quadrado;

        System.out.print("digite um numero para saber o quadrado dele: ");
        numero = input.nextDouble();

            quadrado = numero * numero;

        System.out.println("o quadrado do seu numero é: " + quadrado);

        input.close();
    }
}
