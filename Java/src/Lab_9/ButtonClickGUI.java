package Lab_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickGUI implements ActionListener {
    JFrame f;
    JTextField textField;
    JButton button;

    public ButtonClickGUI() {
        f = new JFrame();
        f.setTitle("Button Click Example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        textField = new JTextField(20);
        button = new JButton("Click Me");
        button.addActionListener(this);

        f.add(textField);
        f.add(button);

        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String message = "You clicked the button";
            JOptionPane.showMessageDialog(f, message);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ButtonClickGUI();
        });
    }
}
