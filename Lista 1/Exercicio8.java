package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3, n4, n6;
        float n5;
        System.out.println("Escreva a primeira nota:");
        n1 = ler.nextInt();
        System.out.println("Escreva a segunda nota:");
        n2 = ler.nextInt();
        System.out.println("Escreva a terceira nota:");
        n3 = ler.nextInt();
        n4 = n1 + n2 + n3;
        System.out.printf("A soma das notas é: %d \n", n4);
        n5 = (float) (n1 + n2 + n3) / 3;
        System.out.printf("A media das notas é: %.0f \n", n5);
        n6 = (n1 + n2 + n3) * 3;
        System.out.printf("A multiplicaçao das notas é: %d \n", n6);
        if (n1 > n2 && n1 > n3) {
            System.out.printf("O maior numero é %d \n", n1);
        }
        if (n2 > n1 && n2 > n3) {
            System.out.printf("O maior numero é %d \n", n2);
        }
        if (n3 > n2 && n3 > n1) {
            System.out.printf("O maior numero é %d \n", n3);
        }
        if (n1 < n2 && n1 < n3) {
            System.out.printf("O menor numero é %d \n", n1);
        }
        if (n2 < n1 && n2 < n3) {
            System.out.printf("O menor numero é %d \n", n2);
        }
        if (n3 < n2 && n3 < n1) {
            System.out.printf("O menor numero é %d \n", n3);
        }
    }
}
