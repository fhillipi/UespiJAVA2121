package com.company.array;

import java.util.ArrayList;

public class Exemplo7 {
    public static void main(String[] args) {

        ArrayList<Carro> itensCarros = new ArrayList<Carro>();

        Carro carro1 = new Carro();
        carro1.modelo = "Ka";
        carro1.anoFabrica = 2019;
        carro1.marca = "ford";

        itensCarros.add(carro1);

        Carro carro2 = itensCarros.get(0);

        System.out.println(carro2.modelo);
    }

}
