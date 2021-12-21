package com.company.pessoas;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public double getBonificacao() {

        //retona o salário + 10%
        return this.salario * 1.10;
    }

}
