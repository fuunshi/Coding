import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MenuApp {
    JFrame jf;
    JMenuBar mb;
    JMenu file, edit;
    JMenuItem New, Exit;
    MenuApp() {
        jf = new JFrame();
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        New = new JMenuItem("New");
        Exit = new JMenuItem("Exit");

        // Add menu into menubar
        mb.add(file);
        mb.add(edit);

        // Add menu item into menu
        file.add(New);
        file.add(Exit);

        // add menu bar into frame
        jf.setJMenuBar(mb);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuApp();
    }
}