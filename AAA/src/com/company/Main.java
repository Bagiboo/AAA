package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public  static void main(String[] args) {
        //Jframe - using it for GUI window, adding components
        ImageIcon image = new ImageIcon("images.png");
        Border boder = BorderFactory.createLineBorder(Color.gray,1);

        JLabel label = new JLabel();
        label.setText("WTW.Brighten your evening with wonderful movie?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set position of text
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.black);//color of text
        label.setFont(Font.SANS_SERIF, );// font
        label.setIconTextGap(5);//set the distance between text and image

        label.setOpaque(true);//visiom
        label.setBorder(boder);
        label.setVerticalAlignment(JLabel.CENTER);//set vert position of items
        label.setHorizontalAlignment(JLabel.CENTER);//same but hor.
        label.setBounds(100,0,250,250);//set x y position on frame



        JFrame frame = new JFrame();
        frame.setTitle("Movie");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes app
        frame.setResizable(false);//stable shape
        frame.setSize(420,420);//for shape
        frame.setVisible(true);
        frame.add(label);
        frame.setLayout(null);

        ImageIcon imagee = new ImageIcon("images.png");
        frame.setIconImage(imagee.getImage());
        frame.getContentPane().setBackground(new Color(176,91,59));

    }

}
