package exercicio.pkg1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        System.out.println("Escreva o um numero:");
        n1 = input.nextInt();
        if (n1 % 2 == 0) {
            System.out.printf("O numero é par");
        } else {
            System.out.printf("O numero é impar");
        }
    }

}
