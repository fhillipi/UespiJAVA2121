package com.company.array;

/*
Array
ArrayList
Coleções
*/

//Vetor[x]
//{0  x-1]
//array para valor
//array para referência

public class Main {

    public static void main(String[] args) {
	// write your code here
     //Conta conta = new Conta();
        /*
     Conta conta;
     conta = new Conta();

     conta.setSaldo(100.25);

     Conta conta1 = new Conta();
     conta1.setSaldo(10.25);

     Conta conta2 = new Conta();
     conta2.setSaldo(1200.25);

     Conta conta3 = new Conta();
     conta3.setSaldo(1030.25);
/*
     System.out.println(conta.getSaldo());
     System.out.println(conta1.getSaldo());
     System.out.println(conta2.getSaldo());
     System.out.println(conta3.getSaldo());
*/
        /*
    double[] saldoConta;

    //Construçao do objeto array de 5 posições
    saldoConta = new double[5];

    saldoConta[0] = conta.getSaldo();
    saldoConta[1] = conta1.getSaldo();
    saldoConta[2] = conta2.getSaldo();
    saldoConta[3] = conta3.getSaldo();

    System.out.println(saldoConta[3]);

    */
    Conta[] minhasContas = new Conta[5];

    /*
    Conta conta = new Conta();
    conta.deposita(100.50);
    */

    minhasContas[0] = new Conta();
    minhasContas[0].deposita(200.47);
    minhasContas[0].deposita(150.25);

    minhasContas[1] = new Conta();
    minhasContas[1].deposita(150);

    minhasContas[2] = new Conta();
    minhasContas[2].deposita(354);

    //
    /*
    for(int i = 0; i<minhasContas.length;i++){
        if(minhasContas[i]!=null)
            System.out.println(minhasContas[i].getSaldo());
    }*/

    for(Conta i: minhasContas){
        if(i !=null)
            System.out.println(i.getSaldo());
    }



    }
}
