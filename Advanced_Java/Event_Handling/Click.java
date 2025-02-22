import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Click extends JFrame implements ActionListener {

    JButton b;

    Click() {
        b = new JButton("Click Me");
        b.addActionListener(this);
        add(b);
        setSize(500, 500);
        setTitle("Event Handler");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Click();
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Button Clicked");
    }
}