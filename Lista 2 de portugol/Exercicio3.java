package exercicio.pkg3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        float n4;
        System.out.println("Escreva a primeira nota");
        n1 = input.nextInt();
        System.out.println("Escreva a segunda nota");
        n2 = input.nextInt();
        System.out.println("Escreva a terceira nota");
        n3 = input.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.printf("A maior nota é %d \n", n1);
        }
        if (n2 > n1 && n2 > n3) {
            System.out.printf("A maior nota é %d \n", n2);
        }
        if (n3 > n2 && n3 > n1) {
            System.out.printf("A maior nota é %d \n", n3);
        }
        n4 = (float) (n1 + n2 + n3) / 3;
        System.out.printf("A media das notas é %f", n4);
    }

}
