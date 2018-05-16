package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3, n4, n5, x = 0, n11;
        float n6, n7 = 1, n8 = 10, n9 = 0, n10 = 0;
        System.out.print("Escreva a quantidade de alunos \n");
        n1 = ler.nextInt();
        n11 = n1 + 1;
        while (x < n11) {
            System.out.printf("Escreva a nota do x aluno");
            System.out.println("Escreva a nota do primeiro bimestre \n");
            n2 = ler.nextInt();
            System.out.println("Escreva a nota do segundo bimestre \n");
            n3 = ler.nextInt();
            System.out.println("Escreva a nota do terceiro bimestre \n");
            n4 = ler.nextInt();
            System.out.println("Escreva a nota do quarto bimestre \n");
            n5 = ler.nextInt();
            n6 = (float) (n1 + n2 + n3 + n4) / 4;
            ++x;
            if (n6 > n7) {
                n7 = n6;
            }
            if (n6 < n8) {
                n8 = n6;
            }
            if (n6 < 0) {
                System.exit(0);
            }
            n9 += n6;
            n10 = (float) n9 / n1;
        }
        System.out.printf("A maior media é %.2f \n", n7);
        System.out.printf("A maior media é %.2f \n", n8);
        System.out.printf("A media da turma é %.2f \n", n10);
    }
}
