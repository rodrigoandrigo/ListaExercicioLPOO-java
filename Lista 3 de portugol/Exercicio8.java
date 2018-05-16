package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n3;
        System.out.println("Escreva até que numero que ver par e impar");
        n1 = ler.nextInt();
        for (int n2 = 1; n2 < n1; ++n2) {
            if (n2 % 2 == 0) {
                System.out.printf("par: %d \n", n2);
            } else {
                System.out.printf("impar: %d \n", n2);
            }

        }

    }
}
