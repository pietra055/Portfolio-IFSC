import java.util.Scanner;

// Escreva um algoritmo para calcular o valor de y como função de x, segundo a função y(x) = 3x + 2, num domínio real.

public class Exercicio04 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
            
            int x, y;

        System.out.print("digite o valor que deseja para 'x': ");
        x = input.nextInt();
            
            y = 3 * x + 2;

            System.out.println("para x = " + x + ", o y vai ser = " + y);

        

            input.close();
    }
    
}
