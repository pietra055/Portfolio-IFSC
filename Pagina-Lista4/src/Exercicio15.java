public class Exercicio15 {
    public static void main(String[] args) {

        int populacaoA = 120000;
        int populacaoB = 80000;

        double taxaCrescimentoA = 0.015;
        double taxaCrescimentoB = 0.035;

        int anos = 0;

        while (populacaoB <= populacaoA) {

            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }

        System.out.println("Em " + anos + " anos, a população da cidade B ultrapassará a população da cidade A.");
    }
}
