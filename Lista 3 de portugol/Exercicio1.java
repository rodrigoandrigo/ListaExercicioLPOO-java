package exercicio.pkg1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x = 1;
        int n1, x1, x2;
        System.out.println("Escreva o primeiro numero");
        n1 = ler.nextInt();
        x1 = n1;
        x2 = n1;

        while (x < 15) {
            System.out.printf("Escreva %d numero \n", x);
            n1 = ler.nextInt();
            if (n1 > x1) {
                x1 = n1;
            }
            if (n1 < x2) {
                x2 = n1;
            }

            x++;

        }

        System.out.printf("O maior numero é:%d \n", x1);
        System.out.printf("O menor numero é:%d \n", x2);
    }

}
