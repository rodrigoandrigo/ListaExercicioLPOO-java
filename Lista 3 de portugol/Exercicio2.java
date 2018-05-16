package exercicio.pkg2;

public class Exercicio2 {

    public static void main(String[] args) {
        int r;
        for (int n1 = 1; n1 < 11; ++n1) {
            for (int n2 = 1; n2 < 11; ++n2) {
                r = n1 * n2;
                System.out.printf("%d x %d = %d \n", n1, n2, r);
            }
        }
    }
}
