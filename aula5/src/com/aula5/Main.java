package com.aula5;

import com.teste.Honda;

public class Main {


    public static void main(String[] args) {

        //Relacionamento de Associação

        Honda hondaObject = new Honda();
        hondaObject.setCodigo(789);
        hondaObject.setNome("Honda");

        Carro carroObject = new Carro(1005);

        carroObject.setMarca(hondaObject.getNome());

        System.out.println(carroObject.toString());


        /*int n;
        Carro carroObject;

        n = 10;


        carroObject = new Carro(1005);

        System.out.println(carroObject.toString());

        System.out.println(carroObject.getCodigo());



        /*
        carro = new Carro();

        carro.placa = "abc1234";

        System.out.println(carro.toString());
*/
	// write your code here

        //tipos de dados primitivos possíveis
        //float | double | long | boolean | short | int | byte |

        //tipos que especificam Objetos
        // (String) | Arrays | Objetos

        /*
        Tipo variavel

        Tipo objeto = new Construtor(parâmetros)


        int n = 10;

        System.out.println(15);
        System.out.println("Teste");
        System.out.println(n);



        //modificadores
        public | private | protected
*/

    }
}
