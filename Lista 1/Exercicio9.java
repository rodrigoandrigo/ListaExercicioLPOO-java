package exercicio9;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2;
        System.out.println("Escreva o primeiro numero");
        n1 = ler.nextInt();
        System.out.println("Escreva o segundo numero");
        n2 = ler.nextInt();
        if (n1 % n2 == 0) {
            System.out.printf("%d é multiplo de %d", n1, n2);
        } else {
            System.out.printf("%d não é multiplo de %d", n1, n2);
        }
    }

}
