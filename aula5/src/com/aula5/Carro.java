package com.aula5;

public class Carro {


    //atributos

    private int codigo;
    private String modelo;
    private int anoFabrica;
    private String marca;
    private String placa;
    private String Chassi;

    public Carro(int codigo){

        this.codigo = codigo;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabrica() {
        return anoFabrica;
    }

    public void setAnoFabrica(int anoFabrica) {
        this.anoFabrica = anoFabrica;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return Chassi;
    }

    public void setChassi(String chassi) {
        Chassi = chassi;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "codigo=" + codigo +
                ", modelo='" + modelo + '\'' +
                ", anoFabrica=" + anoFabrica +
                ", marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", Chassi='" + Chassi + '\'' +
                '}';
    }
}
