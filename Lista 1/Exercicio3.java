package exercicio.pkg3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        System.out.println("Escreva um numero");
        n1 = input.nextInt();

        String n2 = Integer.toString(n1);
        String n3 = "";
        for (int x = n2.length(); x > 0; x--) {
            n3 += n2.substring(x - 1, x);
        }
        System.out.println("A inversão do número é:" + n3);
    }
}
