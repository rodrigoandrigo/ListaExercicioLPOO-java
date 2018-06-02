package exercicio.pkg1;

import java.util.Scanner;

class ContaCorrente {

        Scanner ler = new Scanner(System.in);
        private double saldo;
        private double deposito;
        private double saque;
        public double saldo1;

        public void saldo1() {
            System.out.println("Escreva o saldo da conta");
            saldo1 = ler.nextDouble();
            saldo += saldo1;
        }

        public void Saque() {
            System.out.println("Digite a quantia que deseja retirar");
            saque = ler.nextInt();
            if (saque == 0) {
                System.out.println("Quantia insuficiente para sacar");
            } else {
                if (saque > saldo) {
                    System.out.println("quantia do saque estrapola o valor do saldo");
                } else {
                    System.out.println("Saque realizado com sucesso");
                }
                saldo = saque - saldo;
            }
        }

        public void Deposito() {
            System.out.println("Escreva a quantidade que deseja depositar");
            deposito = ler.nextInt();
            System.out.println("Operaçao realizda com sucesso");
            saldo += deposito;
        }

        public void Impressaodesaldo() {
            System.out.printf("O saldo disponivel na conta é: R$ %.2f", saldo);
        }
    }

    class ContaPoupançao {

        Scanner ler = new Scanner(System.in);
        private double sald;
        private double deposit;
        private double saqu;
        public double saldo2;

        public void saldo2() {
            System.out.println("Escreva o saldo da conta");
            saldo2 = ler.nextDouble();
            sald += saldo2;
        }

        public void Saque1() {
            System.out.println("Digite a quantia que deseja retirar");
            saqu = ler.nextInt();
            if (saqu == 0) {
                System.out.println("Quantia insuficiente para sacar");
            } else {
                if (saqu > sald) {
                    System.out.println("quantia do saque estrapola o valor do saldo");
                } else {
                    System.out.println("Saque realizado com sucesso");
                }
                sald = saqu - sald;
            }
        }

        public void Deposito1() {
            System.out.println("Escreva a quantidade que deseja depositar");
            deposit = ler.nextInt();
            System.out.println("Operaçao realizda com sucesso");
            sald += deposit;
        }

        public void Impressaodesaldo1() {
            System.out.printf("O saldo disponivel na conta é: R$ %.2f", sald);
        }
    }

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ContaPoupançao c = new ContaPoupançao();
        ContaCorrente b = new ContaCorrente();
        int conta, ope, esc;
        System.out.println("Escolha o tipo de conta: \n 1 para conta corrente \n 2 para conta poupança");
        conta = ler.nextInt();
        if (conta == 1) {
            System.out.println("Quer começar a operar com algum saldo \n 1 para sim \n 2 para nao");
            esc = ler.nextInt();
            if (esc == 1) {
                b.saldo1();
            }
            System.out.printf("Caro cliente que voce quer realizar: \n 1 saque  \n 2 deposito \n 3 impresssao de saldo");
            System.out.printf("\n Escreva a opçao que deseja realizar \n");
            ope = ler.nextInt();
            switch (ope) {
                case 1:
                    b.Saque();
                    break;
                case 2:
                    b.Deposito();
                    break;
                case 3:
                    b.Impressaodesaldo();
                    break;
            }
        }
        if (conta == 2) {
            System.out.println("Quer começar a operar com algum saldo \n 1 para sim \n 2 para nao");
            esc = ler.nextInt();
            if (esc == 1) {
                c.saldo2();
            }
            System.out.printf("Caro cliente que voce quer realizar: \n 1 saque  \n 2 deposito \n 3 impresssao de saldo");
            System.out.printf("\n Escreva a opçao que deseja realizar \n");
            ope = ler.nextInt();
            switch (ope) {
                case 1:
                    c.Saque1();
                    break;
                case 2:
                    c.Deposito1();
                    break;
                case 3:
                    c.Impressaodesaldo1();
                    break;
            }
        }
    }
}
