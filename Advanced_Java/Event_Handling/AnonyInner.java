import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnonyInner extends JFrame {
    JButton jb;
    AnonyInner() {
        setSize(300, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Correcting the initialization of the JButton
        jb = new JButton("OK");  // Use 'new' to initialize the button properly
        add(jb);
        
        // Adding ActionListener using an anonymous inner class
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello");
            }
        });
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new AnonyInner();
    }
}
