/**
 * Handle Focus Event
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HandlingFocusEventExample extends JFrame implements FocusListener {
    // Variables
    JTextField tf1;
    JTextField tf2;

    // Constructor
    HandlingFocusEventExample() {
        setTitle("Focus Event Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new FlowLayout());

        tf1 = new JTextField(20);
        tf2 = new JTextField(20);

        add(tf1);
        add(tf2);

        tf1.addFocusListener(this);
        tf2.addFocusListener(this);

        setVisible(true);
    }

    public static void main(String[] args) {
        new HandlingFocusEventExample();
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == tf1) {
            tf1.setBackground(Color.YELLOW);
        } else if (e.getSource() == tf2) {
            tf2.setBackground(Color.YELLOW);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == tf1) {
            tf1.setBackground(Color.WHITE);
        } else if (e.getSource() == tf2) {
            tf2.setBackground(Color.WHITE);
        }
    }
}