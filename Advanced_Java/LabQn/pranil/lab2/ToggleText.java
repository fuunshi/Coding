/**
 * 5. Create a swing frame with a text field and a toggle button. When the toggle button is pressed, 
 * it should display "Button is ON" in the text field and when the toggle button is released, it should display "Button is OFF".
 */
package pranil.lab2;

import javax.swing.*;
import java.awt.event.*;

public class ToggleText {
    public static void main(String[] a) {
        JFrame f = new JFrame("Toggle Demo");
        JTextField tf = new JTextField(25);
        JToggleButton toggle = new JToggleButton("Toggle");

        // Add mouse listener for press and release
        toggle.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                tf.setText("Button is ON");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                tf.setText("Button is OFF");
            }
        });

        f.setLayout(new java.awt.FlowLayout());
        f.add(tf);
        f.add(toggle);

        f.setSize(300, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

