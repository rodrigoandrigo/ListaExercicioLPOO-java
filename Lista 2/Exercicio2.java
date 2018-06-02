package exercicio.pkg2;

import java.util.Scanner;

class Viagem {

    public void Viagem1() {
    }
}

class Pagamento {

    public void Viagem2() {

    }
}

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int dia, dia2, dia3, mes, mes2, ano, ano2;
        long cpf;
        double preço;
        String nome, cidade1, cidade2;
        System.out.println("Escreva o nome completo");
        nome = ler.nextLine();
        System.out.println("Escreva o cpf");
        cpf = ler.nextLong();
        System.out.println("Escreva o pais de origem");
        cidade1 = ler.nextLine();
        cidade1 = ler.nextLine();
        System.out.println("Escreva o dia da viagem");
        dia = ler.nextInt();
        System.out.println("Escreva o mes da viagem");
        mes = ler.nextInt();
        System.out.println("Escreva o ano da viagem");
        ano = ler.nextInt();
        System.out.println("Escreva o pais de destino");
        cidade2 = ler.nextLine();
        cidade2 = ler.nextLine();
        System.out.println("Escreva o dia da volta");
        dia2 = ler.nextInt();
        System.out.println("Escreva o mes da volta");
        mes2 = ler.nextInt();
        System.out.println("Escreva o ano da volta");
        ano2 = ler.nextInt();
        System.out.println("");
        dia3 = dia - dia2;
        if(dia3 < 0){
            dia3 = 0;
            dia3 = dia2 - dia;
        }
        preço = 160.99 * dia3;
        System.out.printf("\n“Obrigado por escolher a nossa agência aérea”\n"
                + "Origem: %s Destino: %s\n"
                + "Valor: R$ %.2f\n"
                + "Nome do passageiro: %s\n"
                + "CPF: %d\n"
                + "Data de ida: %d/%d/%d\n"
                + "Data de volta: %d/%d/%d\n"
                + "“Desejamos que tenha um excelente vôo!!!”\n", cidade1, cidade2, preço, nome, cpf, dia, mes, ano, dia2, mes2, ano2);
    }
}
