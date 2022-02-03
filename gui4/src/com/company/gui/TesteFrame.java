package com.company.gui;

import java.awt.FlowLayout;
import javax.swing.*;

public class TesteFrame extends  JFrame {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private static String SENHA;

    public TesteFrame(){
        super("Tela Principal");


        setLayout(new FlowLayout() );



        label1 = new JLabel("Label Aqui");
        label1.setToolTipText("Teste da Label 1");
        label1.setVerticalTextPosition(SwingConstants.CENTER);
        //label1.setHorizontalTextPosition(SwingConstants.CENTER);
        add(label1);

        Icon bug = new ImageIcon(getClass().getResource("youtube.png"));
        label2 = new JLabel("Label 2 Aqui", bug, SwingConstants.LEFT);
        label2.setToolTipText("Teste da Label 2");
        add(label2);

        label3 = new JLabel();
        label3.setText("Label 3 Aqui");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);

        label3.setToolTipText("Teste da Label 3");
        add(label3);

    }


}
