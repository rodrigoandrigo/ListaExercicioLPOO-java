package exercicio.pkg1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Escreva o primeiro número:");
        n1 = input.nextInt();
        System.out.println("Escreva o segundo número");
        n2 = input.nextInt();
        int n3;
        n3 = n1 + n2;
        int n4;
        n4 = n1 - n2;
        int n5;
        n5 = n1 * n2;
        float n6;
        n6 = (float)n1/n2;
        System.out.printf("A Soma dos números foi %d", n3);
        System.out.printf("\n A Subtração dos números foi %d", n4);
        System.out.printf("\n A Multiplicação dos números  %d", n5);
        System.out.printf("\n A Divisão dos números foi  %f", n6);
        System.out.printf("\n");
    }

}
