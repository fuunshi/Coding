/**
 * Create a swing GUI with a combo box and a text field
 * When Item in combo box is selected, display the selected item in the text field
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxEventExample extends JFrame implements ItemListener {

    JComboBox cb;
    JTextField tf;

    ComboBoxEventExample() {
        setTitle("ComboBox Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new FlowLayout());

        String[] items = {"BBA", "BCA", "BSC", "BCom"};
        cb = new JComboBox(items);
        tf = new JTextField(20);
        cb.addItemListener(this);

        add(cb);
        add(tf);

        setVisible(true);
    }
    public static void main(String[] args) {
        new ComboBoxEventExample();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == cb) {
            String item = (String) cb.getSelectedItem();
            tf.setText(item);
        }
    }
}