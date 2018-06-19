package exercicio.pkg1;

import java.util.Arrays;
import java.util.Scanner;

class MatrizDeInteiros {

    private int n1, n2, n3, n4;
    private int total;
    private int vet[][] = new int[25][25];
    boolean quadrada;

    public MatrizDeInteiros() {
        this.vet[0][0] = 0;

    }

    public void TresNum(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        vet[this.n1][this.n2] = this.n3;

    }

    public boolean èQuadrada() {
        if (this.n1 == this.n2) {
            quadrada = true;
        } else {
            quadrada = false;
        }
        System.out.printf("matriz quadrada = %b\n", quadrada);
        return quadrada;
    }

    public void Somatotal() {
        total += vet[this.n1][this.n2];
        System.out.printf("Total= %d\n", total);
    }

    public void Locali(int n4) {
        this.n4 = n4;
        vet[8][12] = this.n4;
        System.out.println(Arrays.deepToString(vet));
    }

}

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        MatrizDeInteiros m = new MatrizDeInteiros();
        System.out.println("Escreva a linha");
        int n1 = ler.nextInt();
        System.out.println("Escreva a coluna");
        int n2 = ler.nextInt();
        System.out.println("Escreva o numero");
        int n3 = ler.nextInt();
        System.out.println("Escreva outro numero");
        int n4 = ler.nextInt();
        m.TresNum(n1, n2, n3);
        m.èQuadrada();
        m.Somatotal();
        m.Locali(n4);
    }
}
