package Swing_Ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame f;
    JButton b1, b2;
    JTextField t;
    GUI(){
        f = new JFrame();
        f.setLayout(new FlowLayout());
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t = new JTextField(20);
        b1 = new JButton("Appear");
        b2 = new JButton("Clear");
        b1.addActionListener(this);
        b2.addActionListener(this);

        f.add(t);
        f.add(b1);
        f.add(b2);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            t.setText("Hello");
        } else {
            t.setText("");
        }
    }
}
