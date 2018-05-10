package exercicio.pkg5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        int e;
        float n6;
        System.out.println("Escreva a primeira nota");
        n1 = input.nextInt();
        System.out.println("Escreva a segunda nota");
        n2 = input.nextInt();
        System.out.println("Escreva a terceira nota");
        n3 = input.nextInt();
        n4 = (n1 + n2 + n3);
        n5 = (n1 - n2 - n3);
        n6 = (float) (n1 + n2 + n3) / 3;
        System.out.printf("Escolha: \n 1 - soma dos numeros "
                + "\n 2 - subtraçao dos numeros "
                + "\n 3 - media dos numeros \n");
        e = input.nextInt();
        if (e == 1) {
            System.out.printf("A soma dos numeros é: %d", n4);
        }
        if (e == 2) {
            System.out.printf("A Subtração dos numeros é: %d", n5);
        }
        if (e == 3) {
            System.out.printf("A media dos numeros é: %f", n6);
        }
    }

}
