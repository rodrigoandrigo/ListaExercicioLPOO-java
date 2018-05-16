package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int n1, n2, o;
        float resultado;
        Scanner ler = new Scanner(System.in);
        OperacoesSimples c = new OperacoesSimples();

        System.out.println("Escreva o primeiro numero:");
        n1 = ler.nextInt();
        System.out.println("Escreva o segundo numero:");
        n2 = ler.nextInt();

        System.out.printf(
                "\n 1 para somar"
                + "\n 2 para subtrair "
                + "\n 3 para multiplicar "
                + "\n 4 para dividir(divisao por zero é impossivel) \n");
        System.out.println("Escolha a operaçao matematica que deseja realizar");
        o = ler.nextInt();
        if (o == 1) {
            resultado = c.resultadoSoma(n1, n2);
            System.out.printf("A soma dos numeros: %.0f", resultado);
        }
        if (o == 2) {
            resultado = c.resultadoSubtracao(n1, n2);
            System.out.printf("A subtracao dos numeros: %.0f", resultado);
        }
        if (o == 3) {
            resultado = c.resultadoMultiplicacao(n1, n2);
            System.out.printf("A multiplicacao dos numeros: %.0f", resultado);
        }
        if (o == 4) {
            resultado = c.resultadoDivisao(n1, n2);
            System.out.printf("A divisao dos numeros: %.2f", resultado);
        }
    }

}
