import javax.swing.*;
import java.awt.*;

public class GridBagLayoutEx {
    public static void main(String[] args) {
        JFrame jf = new JFrame("GridBagLayout Example");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(300, 300);

        GridBagLayout gL = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        jf.setLayout(gL);

        JButton b1 = new JButton("One");
        JButton b2 = new JButton("Two");
        JButton b3 = new JButton("Three");
        JButton b4 = new JButton("Four");
        JButton b5 = new JButton("Five");

        gbc.insets = new Insets(5, 5, 5, 5); 
        gbc.fill = GridBagConstraints.BOTH;

        gbc.gridx = 0;
        gbc.gridy = 0;
        jf.add(b1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        jf.add(b2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        jf.add(b3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        jf.add(b4, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 50;
        jf.add(b5, gbc);

        jf.setVisible(true);
    }
}
