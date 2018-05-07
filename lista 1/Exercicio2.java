package exercicio.pkg2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int C;
        System.out.printf("Escreva a temperatura em graus centigrados \n :");
        C = input.nextInt();
        float F;
        F = (float)(Math.PI * C + 160) / 5;
        System.out.printf("A temperatura em fahrenheit é: %f", F);
    }
} 
