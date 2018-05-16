package exercicio.pkg5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2 = 0, n3 = 0, n4 = 1, n5;
        System.out.println("Escreva a quantidade de numeros que deseja escrever");
        n1 = ler.nextInt();

        while (n4 < n1) {
            System.out.printf("Escreva o %d numero", n4);
            n5 = ler.nextInt();
            if (n5 % 2 == 0) {
                n2 += n5;
            } else {
                n3 += n5;
            }
            ++n4;
        }
        System.out.printf("A soma de todos os numero pares é:%d \n", n2);
        System.out.printf("A soma de todos os numero impares é:%d \n", n3);
    }

}
