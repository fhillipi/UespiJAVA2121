package com.company;

import com.externo.Aluno;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Fhillipi",28);
        pessoa.setCpf("123654789-52");
        pessoa.setRg("1239567892-3");

        //System.out.println(pessoa.nome);

        //System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getCpf());
        System.out.println(pessoa.getRg());

        Aluno aluno = new Aluno();
        //aluno.matricula = "123546";

        //System.out.println(aluno.matricula);
    }
}
/*
        Public -> acesso completo
        Protected -> acesso limitado ao mesmo pacote e subpacotes
        default -> acesso limitado ao mesmo pacote
        Private -> acesso limitado, pode ser acessado através de metodos de acesso
*/