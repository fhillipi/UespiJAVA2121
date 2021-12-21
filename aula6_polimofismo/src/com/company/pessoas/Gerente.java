package com.company.pessoas;

public class Gerente extends Funcionario{

/*
    @Override
    public double getBonificacao() {
        return this.salario * 1.15;
    }*/

    @Override
    public double getBonificacao() {
        return super.getBonificacao() * 1.05;
    }


}
