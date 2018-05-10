package exercicio.pkg2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dist;
        float velo = 20;
        float tem;

        System.out.println("Escreva a distancia em quilometros:");
        dist = input.nextInt();
        if (dist <= 20) {
            tem = (velo * dist) / 100;
            System.out.printf("O tempo que a onda levor para chegar em %dkm foi: %.2fhoras ", dist, tem);
        } else {
            System.out.print("nao se calcula distancia maior que 20km");
        }
    }
}
