/**
 * 1. Create a swing frame with two buttons "Add" and "Multiply" and 3 text fields. Perform addition and multiplication on respective button click. 
 * Make 3rd text field read only.
 */

package pranil.lab2;

import javax.swing.*;
import java.awt.*;

public class Calc {
    public static void main(String[] a) {
        JFrame f = new JFrame("Calc");
        JTextField t1 = new JTextField(), t2 = new JTextField(), t3 = new JTextField();
        t3.setEditable(false);
        JButton add = new JButton("Add"), mul = new JButton("Multiply");

        add.addActionListener(e -> {
            try { t3.setText("" + (Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText()))); }
            catch (Exception ex) { t3.setText("Error"); }
        });
        mul.addActionListener(e -> {
            try { t3.setText("" + (Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText()))); }
            catch (Exception ex) { t3.setText("Error"); }
        });

        f.setLayout(new GridLayout(2, 3));
        for (JComponent c : new JComponent[]{t1, t2, t3, add, mul}) f.add(c);
        f.setSize(300, 150); f.setDefaultCloseOperation(3); f.setVisible(true);
    }
}
