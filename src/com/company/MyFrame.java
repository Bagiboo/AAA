package com.company;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class MyFrame extends JFrame{
    MyFrame(){

        this.setTitle("Moviebek");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes app
        this.setResizable(false);//stable shape
        this.setSize(420,420);//for shape
        this.setVisible(true);


        ImageIcon image = new ImageIcon("images.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(176,91,59));
    }
}
