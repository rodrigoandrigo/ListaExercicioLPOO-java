package exercicio.pkg1;

import java.util.Scanner;

class Livro {

    public Livro() {

    }

}

class Livrolivraria {

    String nome, autor;

    public Livrolivraria() {
        this("", "");
    }

    public Livrolivraria(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

}

class Professor {

    String nome, departamento;
    int admissao, registro;
    Data a = new Data();

    public Professor() {
        this.nome = "Arnaldo";
        this.departamento = "Administraçao";
        this.admissao = a.DatadeAdmissao();
        this.registro = 794620;
    }

    public void Professor() {
        System.out.printf("\nProfessor: %s\n Departamento: %s\n Admisao: %d\n Registro: %d ", nome, departamento, admissao, registro);
    }
}

class Data {

    public int mes, dia, ano, admissao;

    public int DatadeAdmissao() {
        return this.admissao = 12042018;
    }

}

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Professor p = new Professor();
        p.Professor();

    }
}
