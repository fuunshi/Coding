/**
 *  6. Create a swing frame with a text field, a text area and a button. 
 *  When the button is clicked the multiplication table of value entered in text field should be displayed in the text area.
 */

package pranil.lab2;

import javax.swing.*;
import java.awt.event.*;

public class MultiTable {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiplication Table");
        JTextField textField = new JTextField(5);
        JTextArea textArea = new JTextArea(10, 20);
        JButton button = new JButton("Generate");

        button.addActionListener(e -> {
            int num = Integer.parseInt(textField.getText());
            StringBuilder table = new StringBuilder();
            for (int i = 1; i <= 10; i++) {
                table.append(num).append(" x ").append(i).append(" = ").append(num * i).append("\n");
            }
            textArea.setText(table.toString());
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(textField);
        frame.add(button);
        frame.add(new JScrollPane(textArea));
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
