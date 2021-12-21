package com.company.pessoas;

public class TesteMain {

    public static void main(String[] args) {
        Funcionario funcionario;
        funcionario = new Funcionario();

        funcionario.nome = "Fhillipi";
        funcionario.cpf = "012365498";
        funcionario.salario = 100;

        System.out.println("Salário:"+funcionario.getBonificacao());
//---------------------------------------

        Gerente gerente;
        gerente = new Gerente();

        gerente.nome = "Pedro";
        gerente.cpf = "012365498";
        gerente.salario = 100;

        System.out.println("Salário:"+gerente.getBonificacao());


    }
}
