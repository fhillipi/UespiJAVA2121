package com.company.gui;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Aplicacao ap = new Aplicacao();
        String entrada1 = JOptionPane.showInputDialog("Informe o primeiro valor");

        String entrada2 = JOptionPane.showInputDialog("Informe o segundo valor");

        int numero1 = Integer.parseInt(entrada1);
        int numero2 = Integer.parseInt(entrada2);

        int resultado = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "O resultado: "+resultado, "Resultado",JOptionPane.ERROR_MESSAGE);

        System.out.println(resultado);
    }
}
