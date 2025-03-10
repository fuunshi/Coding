import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;

public class ToggleExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JToggleButton");
        
        JToggleButton toggleButton = new JToggleButton("Off");
        Border b = BorderFactory.createLineBorder(Color.BLACK);
        toggleButton.setBorder(b);
	toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toggleButton.isSelected()) {
                    toggleButton.setText("On");
                } else {
                    toggleButton.setText("Off");
                }
            }
        });
        
        frame.setLayout(new java.awt.FlowLayout());
        
        frame.add(toggleButton);
        
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
