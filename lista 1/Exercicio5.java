package exercicio.pkg5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Escreva um número");
        n1 = input.nextInt();
        n2 = n1 * n1;
        System.out.printf("O quadrado do número é: %d", n2);
    }

}