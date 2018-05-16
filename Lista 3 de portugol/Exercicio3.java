package exercicio.pkg3;

public class Exercicio3 {

    public static void main(String[] args) {
        int r, n1 = 1;
        for (int n2 = 1; n2 < 101; n2 += 2) {
            r = n1 + n2;
            System.out.printf("%d + %d = %d \n", n1, n2, r);
            ++n1;
        }
    }
}
