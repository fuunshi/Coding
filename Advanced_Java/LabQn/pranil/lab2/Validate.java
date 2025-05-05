/**
 * 3. Create a swing frame with two text fields one for name and another for contact number. 
 * Perform validation (name should not contain numbers and contact number should not contain alphaets).
 */

package pranil.lab2;

import javax.swing.*;
import java.awt.*;

public class Validate {
    public static void main(String[] a) {
        JFrame f = new JFrame("Validation");
        JTextField name = new JTextField(), contact = new JTextField();
        JButton check = new JButton("Validate");

        check.addActionListener(e -> {
            String n = name.getText(), c = contact.getText();
            if (n.matches(".*\\d.*"))
                JOptionPane.showMessageDialog(f, "Name must not contain numbers");
            else if (!c.matches("\\d+"))
                JOptionPane.showMessageDialog(f, "Contact must be digits only");
            else
                JOptionPane.showMessageDialog(f, "Valid Input");
        });

        f.setLayout(new GridLayout(3, 1));
        f.add(name); f.add(contact); f.add(check);
        f.setSize(300, 150); f.setDefaultCloseOperation(3); f.setVisible(true);
    }
}
