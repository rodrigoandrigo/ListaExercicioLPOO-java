package exercicio.pkg3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float volume;
        int altura;
        System.out.println("Escreva a altura da lata de oleo");
        altura = input.nextInt();
        volume =(float)(Math.PI * altura * 2);
        System.out.printf("O volume da lata de oleo é: %f", volume);
    }

}