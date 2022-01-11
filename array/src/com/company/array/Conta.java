package com.company.array;

public class Conta {

    private int codigo;
    private double saldo;

    //public Conta()


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double saldo) {
        this.saldo += saldo;
    }
}
