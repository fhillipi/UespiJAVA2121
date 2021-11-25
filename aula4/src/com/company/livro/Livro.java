package com.company.livro;

import com.company.livro.Categoria;

public class Livro {

    private int id;
    private String nome;
    private String autor;
    private String issn;
    private int categoria_id;


    public Livro(int id,String nome, String autor,String issn, int categoria_id){
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.issn = issn;
        this.categoria_id =  categoria_id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }



    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", issn='" + issn + '\'' +
                ", categoria_id=" + categoria_id +
                '}';
    }
}
