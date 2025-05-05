/**
 * 7. Create a swing frame with 2 buttons [show,hide] and a text field. When hide button is clicked, 
 * text field should hide (disappear) and when show button is clicked, the text field should be visible. 
 */

package pranil.lab2;

import javax.swing.*;
import java.awt.event.*;

public class ShowHideTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Show/Hide Text Field");
        JTextField textField = new JTextField(15);
        JButton showButton = new JButton("Show");
        JButton hideButton = new JButton("Hide");

        showButton.addActionListener(e -> textField.setVisible(true));
        hideButton.addActionListener(e -> textField.setVisible(false));

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(textField);
        frame.add(showButton);
        frame.add(hideButton);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
