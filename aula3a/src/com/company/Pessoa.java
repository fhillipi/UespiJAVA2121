package com.company;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private String rg;

    //Metodo Costrutor

    public Pessoa(String nome, int idade){

        this.setNome(nome);
        this.setIdade(idade);

        //this.nome = nome;
        //this.idade = idade;

    }



    //metodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
