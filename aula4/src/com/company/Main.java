package com.company;

import com.company.livro.Categoria;
import com.company.livro.Livro;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        //Categoria categoria = new Categoria(1,"Computaçao");

        //Livro livro = new Livro(12354,"Programação em Java","Fhillipi","987654", categoria.getId());

        System.out.println("Quantidade de Itens");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int codigoCategoria = 0;
        int codigo = 0;
        Livro livro = null;


        for(int i = 0; i<n; i++){

            //Dados da Categoria
            System.out.println("dados da Categoria:");
            Scanner entradaCategoria = new Scanner(System.in);

            codigoCategoria = Integer.parseInt(entradaCategoria.nextLine()); //Codigo
            String nomeCategoria= entradaCategoria.nextLine();//Nome

            Categoria categoria = new Categoria(codigoCategoria,nomeCategoria);

            System.out.println("Dados do Livro");
            Scanner entradaLivro = new Scanner(System.in);

            System.out.println("Código do Livro");
            codigo = Integer.parseInt(entradaLivro.nextLine());
            System.out.println("Nome do Livro");
            String nome = entradaLivro.nextLine();
            System.out.println("Autor do Livro");
            String autor = entradaLivro.nextLine();
            System.out.println("Issn do Livro");
            String issn = entradaLivro.nextLine();

            if(livro == null){
                livro = new Livro(codigo,nome, autor,issn, categoria.getId());
            }
            System.out.println(categoria.toString());

            System.out.println("Objeto Livro:");

            System.out.println(livro.toString());


        }


        //System.out.println(livro.toString());
/*
        for(int i=0; i<3; i++){
            ///// ler dados do teclado Scanner
        }*/
    }
}
