// Create a swing GUI with textfield and two buttons (OK & Clear). When Ok is clicked, display Welcome in textbox. When clear is clicked make the text field emtpy.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventInputBox extends JFrame implements ActionListener {

    JButton b1;
    JButton b2;
    JTextField tf;


    EventInputBox() {
        setTitle("Event Handler with Input Box");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);

        tf = new JTextField();
        b1 = new JButton("Ok");
        b2 = new JButton("Clear");

        tf.setBounds(50, 50, 200, 20);
        b1.setBounds(50, 100, 70, 30);
        b2.setBounds(150, 100, 100, 30);

        add(tf);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setVisible(true);
    }

    public static void main(String[] args) {
        new EventInputBox();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            tf.setText("Welcome");
        } else if (e.getSource() == b2) {
            tf.setText("");
        }
    }
}