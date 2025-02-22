/**
 * Create GUI with fields first and second number, result
 * Perform addition, subtraction, multiplication and division
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    // Variables
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;

    // Constructor
    Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);

        l1 = new JLabel("First Number");
        l2 = new JLabel("Second Number");
        l3 = new JLabel("Result");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3 = new JButton("Multiply");
        b4 = new JButton("Divide");


        l1.setBounds(50, 20, 130, 20);
        tf1.setBounds(200, 20, 150, 20);

        l2.setBounds(50, 50, 130, 20);
        tf2.setBounds(200, 50, 150, 20);

        l3.setBounds(50, 80, 130, 20);
        tf3.setBounds(200, 80, 150, 20);

        b1.setBounds(50, 130, 100, 30);
        b2.setBounds(165, 130, 100, 30);
        b3.setBounds(50, 170, 100, 30);
        b4.setBounds(165, 170, 100, 30);

        tf3.setEditable(false);

        add(l1);
        add(tf1);

        add(l2);
        add(tf2);

        add(l3);
        add(tf3);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setVisible(true);
    }

    // Main Method
    public static void main(String[] args) {
        new Calculator();
    }

    // Action Performed Method
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());
        if (e.getSource() == b1) {
            tf3.setText(String.valueOf(num1 + num2));
        } else if (e.getSource() == b2) {
            tf3.setText(String.valueOf(num1 - num2));
        } else if (e.getSource() == b3) {
            tf3.setText(String.valueOf(num1 * num2));
        } else if (e.getSource() == b4) {
            tf3.setText(String.valueOf(num1 / num2));
        }
    }
}