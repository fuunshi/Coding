import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConverter implements ActionListener, KeyListener {
    JFrame jf;
    JLabel l1, l2, l3;
    JComboBox cb1, cb2;
    JButton b1;

    TempConverter() {
        jf = new JFrame("Temperature Converter");
        l1 = new JLabel("From");
        l2 = new JLabel("To");
        l3 = new JLabel("Output: 0");

        String value = {"Celcius", "Fahrenheit"};
        cb1 = new JComboBox(value);
        cb2 = new JComboBox(value);
        b1 = new JButton("Convert");

        jf.setLayout(new FlowLayout());
        jf.add(l1);
        jf.add(cb1);
        jf.add(l2);
        jf.add(cb2);
        jf.add(l3);
        jf.add(b1);
        jf.add(t3);

        t3.addKeyListener(this);
        b1.addActionListener(this);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TempConverter::new);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double celcius = Double.parseDouble(t3.getText());
        double fahrenheit = (celcius * 9 / 5) + 32;
        t1.setText(String.valueOf(celcius));
        t2.setText(String.valueOf(fahrenheit));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char ch = e.getKeyChar();
        if (!(Character.isDigit(ch) || ch == '.')) {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Required method, but not used
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Required method, but not used
    }
}