/**
 * Create a Swing GUI with a textfield and a button.
 * When the button is clicked, check the value of the textfield.
 * Display Odd or Even in a message dialog box.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DynamicDialog extends JFrame implements ActionListener {
    
    // Variables
    JButton b;
    JTextField tf;

    // Constructor
    DynamicDialog() {
        setTitle("Dynamic Dialog");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);

        tf = new JTextField();
        b = new JButton("Check");

        tf.setBounds(50, 50, 200, 20);
        b.setBounds(50, 100, 100, 30);

        add(tf);
        add(b);

        b.addActionListener(this);

        setVisible(true);
    }

    // Main Method
    public static void main(String[] args) {
        new DynamicDialog();
    }

    // Action Performed Method
    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(tf.getText());
        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Even");
        } else {
            JOptionPane.showMessageDialog(null, "Odd");
        }
    }
}