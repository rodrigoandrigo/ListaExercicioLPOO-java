package exercicio.pkg6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4, n5;
        float n6;
        System.out.println("Escreva o primeiro n�meros");
        n1 = input.nextInt();
        System.out.println("Escreva o segundo n�meros");
        n2 = input.nextInt();
        System.out.println("Escreva o terceiro n�meros");
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

        System.out.printf("A Soma dos n�meros foi %d \n", n4);
        System.out.printf("A Multiplica��o dos n�meros  %d \n", n5);
        System.out.printf("A Divis�o dos n�meros foi  %.2f \n", n6);
        System.out.printf("\n");   
        }
        
    }

}
