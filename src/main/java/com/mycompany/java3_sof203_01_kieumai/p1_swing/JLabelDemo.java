package com.mycompany.java3_sof203_01_kieumai.p1_swing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JLabelDemo {

    public static void main(String[] args) {
        //JLabel: text, image
        ImageIcon image = new ImageIcon("logo2.png");
        Border border = BorderFactory.createLineBorder(Color.RED, 3);

        JLabel label = new JLabel();
        label.setText("Hello from JLabel");
        label.setIcon(image);

        label.setHorizontalTextPosition(JLabel.CENTER); // LEFT, RIGHT
        label.setVerticalTextPosition(JLabel.TOP);

        label.setForeground(Color.RED);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));

        label.setBackground(Color.ORANGE);
        label.setOpaque(true);

        label.setBorder(border);


        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing basics demo");
        frame.setResizable(true);

        frame.add(label);
    }

}
