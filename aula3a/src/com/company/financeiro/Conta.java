package com.company.financeiro;

public class Conta {
    private String titular;
    private int numero;
    private double saldo;

    public Conta(String titular, int numero, double saldo){
       this.setTitular(titular);
       this.setNumero(numero);
       this.setSaldo(saldo);

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void sacar(float valor){
        //this.saldo = this.saldo - valor;

        if(valor<=this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
        }else{
            System.out.println("Saque não realizado. Saldo insuficiente!");
        }

    }


}

