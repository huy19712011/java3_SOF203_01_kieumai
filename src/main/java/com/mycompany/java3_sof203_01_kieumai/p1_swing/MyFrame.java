package com.mycompany.java3_sof203_01_kieumai.p1_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    public MyFrame() {

        button = new JButton();
        button.setBounds(200, 100, 250, 100);
        button.setText("Button");

        label = new JLabel();
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);
        label.setText("Clicked");



        // events
        button.addActionListener(this);


        // Frame: container
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        this.add(button);
        this.add(label);

    }
    // JButton

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setVisible(true);
    }


}
