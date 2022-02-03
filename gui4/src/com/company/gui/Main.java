package com.company.gui;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //TesteFrame testeFrame = new TesteFrame();

        Login login = new Login();
        login.setSize(720,960);
        login.setVisible(true);
        login.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


/*
        HashUtils hashmd5 = new HashUtils();

        System.out.println(hashmd5.getHashMd5("123456"));
        */

    }
}
