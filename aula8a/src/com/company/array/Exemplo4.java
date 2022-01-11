package com.company.array;

public class Exemplo4 {

    public static void main(String[] args) {
        double a1 = 10.45;
        double a2 = 20.53;
        double a3 = 20.559;
        double a4 = 150.58;



        System.out.println(calMedia(a1,a2,a3));
    }

    //metodo para calcular a media
    public static double calMedia(double... numeros){
        double total = 0, media = 0;

        for (double numero : numeros){
            total += numero;
        }
        media = total / numeros.length;

        return media;
    }
}
