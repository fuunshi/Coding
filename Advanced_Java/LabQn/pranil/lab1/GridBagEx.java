/**
 * Qn.4 Write a program to design a frame using GridBagLayout
 */

package pranil.lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridBagEx extends JFrame {
    public GridBagEx() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JButton("Button 1"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(new JButton("Button 2"), gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JButton("Button 3"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(new JButton("Button 4"), gbc);
        
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridBagEx();
    }
}