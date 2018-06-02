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
        this.departamento = "AdministraÃ§ao";
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

    public Data() {
        this.dia = 25;
        this.mes = 05;
        this.ano = 2018;
    }

    public void Data() {
        System.out.printf("Data: %d/%d/%d", dia, mes, ano);
    }
}

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Professor p = new Professor();
        Data d = new Data();
        d.Data();
        p.Professor();

    }
}
