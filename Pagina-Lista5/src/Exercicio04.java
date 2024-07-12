import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        final int COD_CACHORRO_QUENTE = 100;
        final int COD_X_SALADA = 101;
        final int COD_BAURU_COM_OVO = 102;
        final int COD_REFRIGERANTE = 103;

        final double PRECO_CACHORRO_QUENTE = 4.00;
        final double PRECO_X_SALADA = 6.00;
        final double PRECO_BAURU_COM_OVO = 6.50;
        final double PRECO_REFRIGERANTE = 2.00;

        Scanner scanner = new Scanner(System.in);
        int codigoItem;
        int quantidade;
        double valorTotal = 0.0;

        System.out.println("========== Cardápio ==========");
        System.out.println("Código 100 - Cachorro Quente: R$ 4,00");
        System.out.println("Código 101 - X-Salada: R$ 6,00");
        System.out.println("Código 102 - Bauru com Ovo: R$ 6,50");
        System.out.println("Código 103 - Refrigerante: R$ 2,00");
        System.out.println("==============================");

        System.out.print("Digite o código do item desejado (100 a 103): ");
        codigoItem = scanner.nextInt();
        System.out.print("Digite a quantidade desejada: ");
        quantidade = scanner.nextInt();

        switch (codigoItem) {
            case COD_CACHORRO_QUENTE:
                valorTotal = quantidade * PRECO_CACHORRO_QUENTE;
                System.out.println("Item pedido: Cachorro Quente");
                break;
            case COD_X_SALADA:
                valorTotal = quantidade * PRECO_X_SALADA;
                System.out.println("Item pedido: X-Salada");
                break;
            case COD_BAURU_COM_OVO:
                valorTotal = quantidade * PRECO_BAURU_COM_OVO;
                System.out.println("Item pedido: Bauru com Ovo");
                break;
            case COD_REFRIGERANTE:
                valorTotal = quantidade * PRECO_REFRIGERANTE;
                System.out.println("Item pedido: Refrigerante");
                break;
            default:
                System.out.println("Código de item inválido.");
                break;
        }

        if (codigoItem >= COD_CACHORRO_QUENTE && codigoItem <= COD_REFRIGERANTE) {
            System.out.printf("Valor a ser pago: R$ %.2f\n", valorTotal);
        }

        scanner.close();
    }
}
