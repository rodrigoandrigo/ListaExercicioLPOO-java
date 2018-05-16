package exercicio.pkg6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4, n5;
        float n6;
        System.out.println("Escreva o primeiro números");
        n1 = input.nextInt();
        System.out.println("Escreva o segundo números");
        n2 = input.nextInt();
        System.out.println("Escreva o terceiro números");
        n3 = input.nextInt();
        if (n1 > n2) {
            System.exit(0);
        }
        if (n2 > n3) {
            System.exit(0);
        } else{
            n4 = n1 + n2 + n3;

        n5 = n1 * n2 * n3;

        n6 = (float) (n1 + n2 + n3) / 3;

        System.out.printf("A Soma dos números foi %d \n", n4);
        System.out.printf("A Multiplicação dos números  %d \n", n5);
        System.out.printf("A Divisão dos números foi  %.2f \n", n6);
        System.out.printf("\n");   
        }
        
    }

}
