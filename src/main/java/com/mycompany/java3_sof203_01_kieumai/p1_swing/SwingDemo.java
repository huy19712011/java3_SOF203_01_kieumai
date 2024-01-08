package com.mycompany.java3_sof203_01_kieumai.p1_swing;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SwingDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing basics demo");
        frame.setResizable(true);

        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());

        frame.getContentPane().setBackground(Color.GRAY);
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.getContentPane().setBackground(new Color(0xFF0000));
    }
}
