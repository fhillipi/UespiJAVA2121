package com.company.array;

import java.util.Random;

public class Exemplo1 {

    public static void main(String[] args) {
        Random radonNumbers = new Random();
        int[] frequencia = new int[61];

        for(int roll = 1; roll < 10000;roll++){

            ++frequencia[1 + radonNumbers.nextInt(60)];
        }
        System.out.printf("%s%10s\n","Face "," Frequencia");

        for(int face = 1; face < frequencia.length; face++){
            System.out.printf("%s%10s\n",face,frequencia[face]);
        }

    }
}
