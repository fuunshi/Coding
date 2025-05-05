/**
 * Qn.5 Write a program to design a frame using GroupLayout
 */
package pranil.lab1;

import javax.swing.*;
import java.awt.*;

public class GroupEx extends JFrame {
    public GroupEx() {
        JButton b1 = new JButton("Button 1"), b2 = new JButton("Button 2"),
                b3 = new JButton("Button 3"), b4 = new JButton("Button 4");
        GroupLayout g = new GroupLayout(getContentPane());
        setLayout(g);
        g.setAutoCreateGaps(true);
        g.setAutoCreateContainerGaps(true);
        g.setHorizontalGroup(g.createSequentialGroup()
            .addGroup(g.createParallelGroup().addComponent(b1).addComponent(b3))
            .addGroup(g.createParallelGroup().addComponent(b2).addComponent(b4))
        );
        g.setVerticalGroup(g.createSequentialGroup()
            .addGroup(g.createParallelGroup().addComponent(b1).addComponent(b2))
            .addGroup(g.createParallelGroup().addComponent(b3).addComponent(b4))
        );
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] a) {
        new GroupEx();
    }
}
