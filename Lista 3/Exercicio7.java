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

    public Professor(String nome, String departamento, int admissao) {
        this.nome = nome;
        this.departamento = departamento;
        this.admissao = admissao;
        this.registro = 794620;
    }

    public void Professor() {
        System.out.printf("\nProfessor: %s\n Departamento: %s\n Admisao: %d\n Registro: %d ", nome, departamento, admissao, registro);
    }
}

class Data {

    public int mes, dia, ano, admissao;

    public Data() {
        this.dia = 24;
        this.mes = 11;
        this.ano = 2018;
    }

    public int DatadeAdmissao() {
        return this.admissao = 12042018;
    }

    public void Mostrardata() {
        System.out.printf("\n \n Data:%d/%d/%d\n", dia, mes, ano);
    }
}

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, departamento;
        int admissao;
        System.out.println("Escreva o nome do professor");
        nome = ler.next();
        System.out.println("Escreva o departamento do professor");
        departamento = ler.next();
        System.out.println("Escreva a data de admissao do professor,escreva tudo junto sem barras");
        admissao = ler.nextInt();
        Professor p = new Professor(nome, departamento, admissao);
        p.Professor();

    }
}
