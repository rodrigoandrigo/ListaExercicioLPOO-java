package exercicio.pkg4;

public class Exercicio4 {

    public static void main(String[] args) {
        for (int n1 = 1000; n1 < 2000; ++n1) {
            if (n1 % 11 == 5) {
                System.out.println(n1);
            }
            ++n1;
        }
    }
}
