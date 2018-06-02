package exercicio.pkg3;

import java.util.Scanner;

class Fatura {

    public String numero;
    public String descriçao;
    public int quantidadecomprada, q6;
    public double preço, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;

    public String setnumero() {
        return this.numero = "1726224";
    }

    public String getnumero() {
        return this.numero;
    }

    public void setdescriçao() {
        this.descriçao = "descriça";
    }

    public String getdescriçao() {
        return descriçao;
    }

    public int setquantidadecomprada(int q1, int q2, int q3, int q4, int q5) {
        if (q1 <= 0) {
            t1 = 0.0;
        } else {
            t1 = q1;
        }
        if (q2 <= 0) {
            t2 = 0.0;
        } else {
            t2 = q2;
        }
        if (q3 <= 0) {
            t3 = 0.0;
        } else {
            t3 = q3;
        }
        if (q4 <= 0) {
            t4 = 0.0;
        } else {
            t4 = q4;
        }
        if (q5 <= 0) {
            t5 = 0.0;
        } else {
            t5 = q5;
        }
        q6 = q1 + q2 + q3 + q4 + q5;
        if (q6 <= 0) {
            this.quantidadecomprada = 0;
        } else {
            this.quantidadecomprada = q6;
        }
        return this.quantidadecomprada;
    }

    public int getquantidadecomprada() {

        return this.quantidadecomprada;
    }

    public double setpreço(double p1, double p2, double p3, double p4, double p5) {
        if (p1 <= 0) {
            t7 = 0.0;
        } else {
            t7 = t1 * p1;
        }
        if (p2 <= 0) {
            t8 = 0.0;
        } else {
            t8 = t2 * p2;
        }
        if (p3 <= 0) {
            t9 = 0.0;
        } else {
            t9 = t3 * p3;
        }
        if (p4 <= 0) {
            t10 = 0.0;
        } else {
            t10 = t4 * p4;
        }
        if (p5 <= 0) {
            t11 = 0.0;
        } else {
            t11 = t5 * p5;
        }
        t6 = t7 + t8 + t9 + t10 + t11;
        this.preço = t6;
        return this.preço;
    }

    public double getpreço() {

        return this.preço;

    }

}

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Fatura a = new Fatura();
        int q1, q2, q3, q4, q5;
        double p1, p2, p3, p4, p5;
        System.out.println("Escreva a quantidade do item 1");
        q1 = ler.nextInt();
        System.out.println("Escreva o preço do item 1");
        p1 = ler.nextDouble();
        System.out.println("Escreva a quantidade do item 2");
        q2 = ler.nextInt();
        System.out.println("Escreva o preço do item 2");
        p2 = ler.nextDouble();
        System.out.println("Escreva a quantidade do item 3");
        q3 = ler.nextInt();
        System.out.println("Escreva o preço do item 3");
        p3 = ler.nextDouble();
        System.out.println("Escreva a quantidade do item 4");
        q4 = ler.nextInt();
        System.out.println("Escreva o preço do item 4");
        p4 = ler.nextDouble();
        System.out.println("Escreva a quantidade do item 5");
        q5 = ler.nextInt();
        System.out.println("Escreva o preço do item 5");
        p5 = ler.nextDouble();
        a.setquantidadecomprada(q1, q2, q3, q4, q5);
        a.setpreço(p1, p2, p3, p4, p5);
        System.out.println("");
        System.out.println("");
        System.out.println("------------------");
        System.out.printf("Fatura %s       \n", a.setnumero());
        System.out.printf("Quantidade|Preço\n");
        System.out.println(q1 + "          R$" + p1);
        System.out.println(q2 + "          R$" + p2);
        System.out.println(q3 + "          R$" + p3);
        System.out.println(q4 + "          R$" + p4);
        System.out.println(q5 + "          R$" + p5);
        System.out.printf("total =      R$%.2f\n", a.getpreço());
    }
}
