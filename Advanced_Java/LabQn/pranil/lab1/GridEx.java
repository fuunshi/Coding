/**
 * Qn.3 Write a program to design a frame using GridLayout
 */

package pranil.lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridEx extends JFrame {
    public GridEx() {
        setLayout(new GridLayout(3, 2));
        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));
        add(new JButton("Button 4"));
        add(new JButton("Button 5"));
        add(new JButton("Button 6"));
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridEx();
    }
}