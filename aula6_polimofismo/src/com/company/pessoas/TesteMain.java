package com.company.pessoas;

public class TesteMain {

    public static void main(String[] args) {

        //Funcionario f = new Funcionario();

        Gerente gerente = new Gerente();
        gerente.salario = 100;

        System.out.println(gerente.getBonificacao());

        /*
        Gerente gerente = new Gerente();
        Funcionario funcionario = gerente;

        funcionario.salario = 100.00;

        System.out.println(funcionario.getBonificacao());

        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        controle.registra(gerente);
        controle.registra(funcionario);

        System.out.println(controle.getTotalDeBonificacoes());
        /*
        Gerente gerente;
        gerente = new Gerente();
        //
        Funcionario funcionario;
        funcionario = gerente;

        /*
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

*/
    }

  /*       */
}
