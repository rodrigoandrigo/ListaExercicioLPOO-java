package exercicio.pkg2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l1;
        int l2;
        int l3;
        System.out.println("Escreva a medida do primeiro lado do triangulo:");
        l1 = input.nextInt();
        System.out.println("Escreva a medida do segundo lado do triangulo:");
        l2 = input.nextInt();
        System.out.println("Escreva a medida do terceiro lado do triangulo:");
        l3 = input.nextInt();
        if (l1 + l2 > l3 && l2 + l3 > l1 && l1 + l3 > l2) {
            System.out.println("O triangulo é regular");
        } else {
            System.out.println("O triangulo é irregular");
        }

    if (l1==l2 && l3!=l2 && l1!=l3) {
        System.out.printf("De acordo com as medidas informadas é um triangulo isosceles");
    }
    if (l1!=l2 && l2!=l3 && l3!=l1) {
        System.out.printf("De acordo com as medidas informadas é um triangulo escaleno");
    }
    if (l1==l2 && l2==l3 && l1==l3){
        System.out.printf("De acordo com as medidas informadas é um triangulo equilatero");
    } else{
}

    }
}
