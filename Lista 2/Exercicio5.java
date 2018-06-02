package exercicio.pkg5;

import java.util.Scanner;

class Data {

    public int mes, dia, ano;

    public int setdia(int dia) {
        return this.dia = dia;
    }

    public int getdia() {
        return this.dia;
    }

    public int setmes(int mes) {
        return this.mes = mes;
    }

    public int getmes() {
        return this.mes;
    }

    public int setano(int ano) {
        return this.ano = ano;
    }

    public int getano() {
        return this.ano;
    }

    public void exibeData() {
        System.out.printf("\ndata:%d/%d/%d\n", dia, mes, ano);
    }

}

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Data d = new Data();
        int dia, mes, ano;
        System.out.println("Escrava o dia");
        dia = ler.nextInt();
        d.setdia(dia);
        System.out.println("Escrava o mes");
        mes = ler.nextInt();
        d.setmes(mes);
        System.out.println("Escrava o ano");
        ano = ler.nextInt();
        d.setano(ano);
        d.exibeData();
    }

}
