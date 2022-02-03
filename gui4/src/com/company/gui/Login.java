package com.company.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;
    private static String SENHA;

    public Login() {
        super("Tela de login");

        setLayout(new FlowLayout());

        SENHA = "e10adc3949ba59abbe56e057f20f883e";
        /*
        textField1 = new JTextField(10);
        add(textField1);

        textField2 = new JTextField("Digite o texto aqui");
        add(textField2);

        textField3 = new JTextField("Digite o texto aqui");
        textField3.setEditable(false);
        add(textField3);
        */

        passwordField = new JPasswordField(15);
        add(passwordField);


        //handler de eventos
        TextFieldHandler handler = new TextFieldHandler();
        //textField1.addActionListener(handler);
        //textField2.addActionListener(handler);
        //textField3.addActionListener(handler);
        passwordField.addActionListener(handler);

    }// fim do construtor


    private class TextFieldHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e ) {
            String string = "";
            HashUtils hashmd5 = new HashUtils();

            if(e.getSource() == passwordField){
                string = String.format("%s", e.getActionCommand());
            }



            if(hashmd5.getHashMd5(string).equals(SENHA)){
                JOptionPane.showMessageDialog(null,"Senha OK");
            }else
            {
                JOptionPane.showMessageDialog(null,"Senha Incorreta!");
            }
            System.out.println(string);
            System.out.println(hashmd5.getHashMd5(string));



            /*
            if(e.getSource() == textField1){
                string = String.format("a origem foi o campo text1: %s:", e.getActionCommand());
            }
            else if(e.getSource() == textField2){
                string = String.format("a origem foi o campo text2: %s:", e.getActionCommand());
            }
            else if(e.getSource() == textField3){
                string = String.format("a origem foi o campo text3: %s:", e.getActionCommand());
            }

            else if(e.getSource() == passwordField){
                string = String.format("a origem foi o campo senha: %s", e.getActionCommand());
            }
            */


            //JOptionPane.showMessageDialog(null,string);

        }
    }

}

