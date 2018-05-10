package exercicio.pkg4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        System.out.println("Escreva um numero");
        n1 = input.nextInt();
        System.out.println("Escreva outro numero");
        n2 = input.nextInt();
        n3 = n1;
        n1 = n2;
        n2 = n3;
        System.out.printf("O valor de n1 é: %d \n", n1);
        System.out.printf("O valor de n2 é: %d", n2);
    }

}