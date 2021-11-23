package com.company;

import com.company.financeiro.Conta;

public class TestaConta {

    public static void main(String[] args){

        Conta minhaConta = new Conta("Fhillipi",12546,15.25);

        System.out.println(minhaConta.getSaldo());


        minhaConta.sacar(5);	//	saldo	é	só	1000!!

        System.out.println(minhaConta.getSaldo());
    }
}
