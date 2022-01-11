package com.company.array;

public class Exemplo0 {

    public static void main(String[] args) {

        int[] array = {87,68,94,100,83,78,85,91,76,87};
        int total = 0;

        for(int cont = 0; cont< array.length; cont++) {
            total += array[cont];
        }

        for(int cont = 0; cont< array.length; cont++) {
            System.out.printf("%5d%8d\n", cont, array[cont]);
        }

        System.out.println(total);


        // write your code here
        /*
        final int ARRAY_LENGTH = 10;

        int[] array = new int[ARRAY_LENGTH];

        for(int cont = 0; cont< array.length; cont++) {
            //System.out.printf("%5d%8d\n", cont, array[cont]);
            array[cont] = 2 + 2 * cont;
        }

        for(int cont = 0; cont< array.length; cont++) {
            System.out.printf("%5d%8d\n", cont, array[cont]);
        }

        //int[] array = new int[10];
        /*
        for(int cont = 0; cont< array.length; cont++) {
            System.out.printf("%5d%8d\n", cont, array[cont]);
        }

        for(int cont = 0; cont< n.length; cont++) {
            System.out.printf("%5d%8d\n", cont, n[cont]);
        }
*/
    }
}
