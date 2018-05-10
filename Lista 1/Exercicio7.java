package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2;
        System.out.print("Escreva o primeiro numero \n");
        n1 = ler.nextInt();
        System.out.printf("Escreva o segundo numero \n");
        n2 = ler.nextInt();
        if (n1 > n2) {
            System.out.printf("%d is larger", n1);
        }
        if (n2 > n1) {
            System.out.printf("%d is larger", n2);
        }
        if (n1 == n2) {
            System.out.print("These numbers are equal");
        }
    }

}
