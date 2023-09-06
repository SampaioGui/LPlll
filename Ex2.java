import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int dado1, dado2, ponto, soma = 0;

        dado1 = gerador.nextInt(7);
        dado2 = gerador.nextInt(7);

        ponto = dado1 + dado2;

        System.out.println("Dado 1: " + dado1 + ", Dado 2: " + dado2);
        System.out.println("Ponto: " + ponto);

        if (ponto == 7 || ponto == 11) {
            System.out.println("Jogador venceu!!");
            System.exit(0);
        } else if (ponto == 2 || ponto == 3 || ponto == 12) {
            System.out.println("Jogador perdeu, a banca vence");
            System.exit(0);
        } else {

            System.out.println("Iniciando estágio 2");

            for (int i = 1; soma != 7; i++) {
                dado1 = gerador.nextInt(7);
                dado2 = gerador.nextInt(7);
                soma = dado1 + dado2;

                System.out.println("Dado 1: " + dado1 + ", Dado 2: " + dado2);
                System.out.println("Jogada " + i + ": " + soma);
                if (soma == ponto) {
                    System.out.println("Jogador venceu");
                    break;
                }
                if (soma == 7) {
                    System.out.println("Jogador perdeu");
                }


            }


        }


    }
}
