/**
 * 2. Create a swing frame with a menu bar and two menus "File" and "Help". The "File" menu should contain "New","Save","Open" and "Exit" menu items. 
 * The "Help" menu should contain "About Us". When "Exit" is clicked, program should terminate. When "About Us" is clicked a custom dialog box should 
 * be displayed that prints the "name and contact number of developer" in two different JLabels using font size 26, font style BOLD and font -- Algerian.
 */

package pranil.lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuEx {
    public static void main(String[] a) {
        JFrame f = new JFrame("Menu Example");
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File"), help = new JMenu("Help");
        JMenuItem newI = new JMenuItem("New"), save = new JMenuItem("Save"),
                  open = new JMenuItem("Open"), exit = new JMenuItem("Exit"),
                  about = new JMenuItem("About Us");

        exit.addActionListener(e -> System.exit(0));
        about.addActionListener(e -> {
            JDialog d = new JDialog(f, "About Us", true);
            d.setLayout(new GridLayout(2, 1));
            Font font = new Font("Algerian", Font.BOLD, 26);
            JLabel name = new JLabel("Name: Pranil XYZ", SwingConstants.CENTER);
            JLabel contact = new JLabel("Contact: 9876543210", SwingConstants.CENTER);
            name.setFont(font); contact.setFont(font);
            d.add(name); d.add(contact);
            d.setSize(400, 200); d.setLocationRelativeTo(f); d.setVisible(true);
        });

        file.add(newI); file.add(save); file.add(open); file.add(exit);
        help.add(about);
        mb.add(file); mb.add(help);
        f.setJMenuBar(mb);
        f.setSize(400, 300); f.setDefaultCloseOperation(3); f.setVisible(true);
    }
}
