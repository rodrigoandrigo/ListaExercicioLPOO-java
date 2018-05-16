package calculadora;

public class OperacoesSimples {

    private int rs;
    private int rs1;
    private int rm;
    private float rd;

    public int resultadoSoma(int n1, int n2) {
        rs = n1 + n2;
        return rs;
    }

    public int resultadoSubtracao(int n1, int n2) {
        rs1 = n1 - n2;
        return rs1;
    }

    public int resultadoMultiplicacao(int n1, int n2) {
        rm = n1 * n2;
        return rm;
    }

    public float resultadoDivisao(int n1, int n2) {
        rd = (float) n1 / n2;
        return rd;
    }
}
