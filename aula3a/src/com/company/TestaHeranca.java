package com.company;

import com.company.financeiro.Cliente;
import com.company.financeiro.Conta;

public class TestaHeranca {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Pedro",25,"Rua do Rio Parnaiba");

        System.out.println(cliente.getNome());
        //cliente.setCpf("77626747569");765.285.170-02
        cliente.setCpf("76528517002");
        System.out.println(cliente.getCpf());

        Conta conta = new Conta(cliente.getNome(), 123456,1000);

        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());



        if(cliente.validarCPF(cliente.getCpf())){
            System.out.println("CPF válido");
        }else{
            System.out.println("CPF Inválido");
      }
    }
}
