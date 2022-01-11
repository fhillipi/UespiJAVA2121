package com.company.array;

public class Example3 {
    public static void main(String[] args) {
        int[][] matriz = {{10,20,30,50}, {70,2},{30,14,95,12,5}};

        printMatriz(matriz);
    }

    public static void printMatriz( int[][] matriz){

        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }

    }
}
