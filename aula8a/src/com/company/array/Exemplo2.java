package com.company.array;

public class Exemplo2 {

    public static void main(String[] args) {
    /*
        int[] array = {87,67,94,100,83,78,85,91,76,87};
        int total = 0;

        for(int numero : array){
            total += numero;
        }

        System.out.println(total);
        */

        int[] array = {11,2,53,8,70};

        //imprime o array normal
        for(int numero : array){
            System.out.println(numero);
        }

        //modificar os elemento, multiplicando por 2
        modificaArray(array);

        System.out.println("--------------------------");

        //imprimindo apos a modificaçao
        for(int numero : array){
            System.out.println(numero);
        }

        System.out.println("--------------------------");
        //modifica um elemento especifico do array
        modificaElemento(array[3]);
        System.out.println("--------------------------");

        //imprimindo apos a modificaçao
        for(int numero : array){
            System.out.println(numero);
        }
        //imprimindo apos a modificaçao

    }// fim do metodo main

    public static void modificaArray(int[] array2){

        for(int cont=0; cont< array2.length; cont++){

            array2[cont] *= 2;
        }
    }

    public static void modificaElemento(int numero){
        numero *= 2;
        System.out.println(numero);
    }
}
