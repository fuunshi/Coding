/**
 * Qn.2 Write a program to design a frame using BorderLayout
 */

package pranil.lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BorderEx extends JFrame {
    public BorderEx() {
        setLayout(new BorderLayout());
        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("Center"), BorderLayout.CENTER);
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new BorderEx();
    }
}