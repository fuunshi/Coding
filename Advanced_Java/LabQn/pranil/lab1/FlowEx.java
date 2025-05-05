
/**
 * Qn.1 Write a program to design a frame using FrameLayout
 */

package pranil.lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlowEx extends JFrame {
    public FlowEx() {
        setLayout(new FlowLayout());
        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowEx();
    }
}