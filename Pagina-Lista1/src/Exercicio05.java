import java.util.Scanner;

//Escreva um algoritmo para calcular o consumo médio de um automóvel (medido em Km/l), dado  que são conhecidos a distância total percorrida e o volume de combustível consumido para percorrê-la (medido em litros). Fórmula: consumo = distancia / volume


public class Exercicio05 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double distancia, litros, consumo;

        System.out.print("digite qual a distancia em KM foi percorridos: ");
        distancia = input.nextDouble();

        System.out.print("Quantos litros foram consumidos de gasolina durante o trajeto? ");
        litros = input.nextDouble();

        consumo = distancia  / litros;
        
        System.out.println("o consumo médio gasto foi de: " + consumo + " KM/L");

        input.close();



        
    }
}
