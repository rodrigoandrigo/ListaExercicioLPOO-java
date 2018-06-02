package exercicio.pkg4;

import java.util.Scanner;

class Empregado {

    public String pnome, unome, cnome;
    public double ss, sm, sn, s1, s2, s3;

    public String setpnome(String nome1) {
        this.pnome = nome1;
        return this.pnome;
    }

    public String getpnome() {
        return this.pnome;
    }

    public String setunome(String nome2) {
        this.unome = nome2;
        return this.unome;
    }

    public String getunome() {
        return this.unome;
    }

    public double setsm(double sala) {
        s1 = (double) sala;
        return this.sm = s1;
    }

    public double getsm() {
        return this.sm;
    }

    public double setsn() {
        s2 = s1 * 12;
        return this.sn = s2;
    }

    public double getsn() {
        return this.sn;
    }

    public double setss() {
        s3 = s2 * 0.10;
        return this.ss = s3;
    }

    public double getss() {
        return this.ss;
    }
}

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Empregado c = new Empregado();
        String nome1, nome2;
        double sala;
        System.out.println("Escreva o primeiro nome");
        nome1 = ler.next();
        System.out.println("Escreva o ultimo nome");
        nome2 = ler.next();
        System.out.println("Escreva o salario mensal");
        sala = ler.nextDouble();
        c.setpnome(nome1);
        c.setunome(nome2);
        c.setsm(sala);
        System.out.printf("\n Nome:%s %s \n", nome1, nome2);
        System.out.println("Salario anual:" + c.getsn());
        System.out.println("Salario anual com aumento:" + c.getsn());

    }
}
