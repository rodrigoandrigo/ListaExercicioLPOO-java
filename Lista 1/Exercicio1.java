package exercicio.pkg1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float alu = 550;
        for (int ano = 1; ano <= 6;) {
            for (int mes = 1; mes <= 12; mes++) {
                System.out.printf("O valor do aluguel do mes %d do ano %d é %.2f \n", mes, ano, alu);
            }
            alu = ((alu * 0.1f) + alu);
            ano++;
        }
    }

}
