package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int r, dia;
        float circ, area;
        System.out.println("Escreva o raio do circulo");
        r = ler.nextInt();
        dia = 2 * r;
        circ = 2 * ((float) Math.PI * r);
        area = (float) (Math.PI * (r * r));
        System.out.printf("O diametro do circulo é: %d \n", dia);
        System.out.printf("A circunferencia do circulo é: %.2f \n", circ);
        System.out.printf("A area do ciuculo é: %.2f \n", area);

    }

}
