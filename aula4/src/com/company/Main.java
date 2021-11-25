package com.company;

import com.company.livro.Categoria;
import com.company.livro.Livro;

public class Main {

    public static void main(String[] args) {
        Categoria categoria = new Categoria(1,"Computaçao");

        Livro livro = new Livro(12354,"Programação em Java","Fhillipi","987654", categoria.getId());

        System.out.println(livro.toString());
    }
}
