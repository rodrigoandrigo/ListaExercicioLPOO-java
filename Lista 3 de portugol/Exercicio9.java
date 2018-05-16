package exercicio9;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n3 = 0;
        System.out.println("Escreva um numero");
        n1 = ler.nextInt();
        for (int n2 = 1; n2 <= n1; n2++) {
            if (n1 % n2 == 0) {
                n3++;
            }
        }
        if (n3 == 2) {
            System.out.println("O numero é primo");
        }
        if ((n3 != 2) && (n3 % 2 == 0)) {
            System.out.println("O numero nao é primo");
        }
    }

}
