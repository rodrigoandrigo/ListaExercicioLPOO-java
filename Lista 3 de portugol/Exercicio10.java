package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n3;
        System.out.println("Escreva até que numero quer ver os numeros primos");
        n1 = ler.nextInt();
        for (int n2 = 0; n2 <= n1; n2++) {
            n3 = 0;
            for (float n4 = 0; n4 <= n2; n4++) {
                if (n2 % n4 == 0) {
                    n3++;
                }
            }
            if (n3 == 2) {
                System.out.printf("%d ,", n2);
            }
        }
    }
}
