package com.company.array;

import java.util.Arrays;
import java.util.ArrayList;
public class Exemplo6 {
    public static void main(String[] args) {

        ArrayList<String> itens = new ArrayList<String>();
        itens.add("fiat Uno");
        itens.add("ford KA");
        itens.add("Corola");
        itens.add("Gol");
        itens.add("Chevet");
        itens.add("Brasilia Amarela");
        itens.add("Gol");

        for(int cont = 0; cont< itens.size();cont++)
        {
            //System.out.printf("%s",itens.get(cont));
            System.out.printf("[%s] ->  %s\n", cont, itens.get(cont));
        }


        itens.clear();
        System.out.println("-------------------------------");

        if(itens.isEmpty()){
            System.out.println("ArrayList está vazio");
        }else{
            System.out.println("contem itens");
        }
        //System.out.println(itens.contains("Gol") ? "Contem o Valor" : "Não está presente");

        /*
        itens.remove("Gol");
        itens.remove("Gol");

        */

        for(int cont = 0; cont< itens.size();cont++)
        {
            //System.out.printf("%s",itens.get(cont));
            System.out.printf("[%s] ->  %s\n", cont, itens.get(cont));
        }


        /*
        for(String valor : itens){
            System.out.println(valor);
        }
        */


        /*
        //double[] array = {10.5,11.302,57.3,47.3, 9.5, 4.0};

        //ordenar asc o array
        Arrays.sort(array);

        double valor = Arrays.binarySearch(array, 10.5);

        if(valor>=0){
            System.out.println("valor encontrado!");
        }else
        {System.out.println("valor não encontrado!");}

        /*
        for(double valor : array){
            System.out.println(valor);
        }*/
    }
}
