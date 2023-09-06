import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 10;
        float[] medicoes = new float[n];
        float[] difMedicoes = new float[n];
        float[] qDifMedicoes = new float[n];
        float soma = 0, somaDif = 0;
        float media = 0, mediaV = 0;
        float dP = 0, pctg = 0;


        for (int i = 0; i < n; i++) {
            System.out.println("Digite a medicao " + (i + 1) + ":");
            medicoes[i] = scanner.nextFloat();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Medicao " + (i + 1) + ": " + medicoes[i]);
            soma = soma + medicoes[i];
        }

        media = soma / n;

        System.out.println("Media: " + media);

        for (int i = 0; i < n; i++) {
            difMedicoes[i] = medicoes[i] - media;
            qDifMedicoes[i] = difMedicoes[i] * difMedicoes[i];
            somaDif = somaDif + qDifMedicoes[i];
        }

        mediaV = somaDif / n;

        dP = (float) Math.sqrt(mediaV);

        System.out.println("Desvio Padrão: " + dP);

        pctg = (float) ((10.0 / 100.0) * media);

        if (dP <= pctg)
            System.out.println("Multimetro operando normalmente......");
        else
            System.out.println("MULTIMETRO QUEBRADO!!!!!!!");


    }
}
