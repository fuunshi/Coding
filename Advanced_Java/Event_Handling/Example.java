import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example extends JFrame implements ActionListener {

    // Declare components
    JTextArea textArea;
    JMenuItem openMenuItem, saveMenuItem;

    Example() {
        // Set the title of the window
        setTitle("Basic Swing App");

        // Create a text area and wrap it in a scroll pane
        textArea = new JTextArea(20, 50);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the File menu and its items
        JMenu fileMenu = new JMenu("File");
        openMenuItem = new JMenuItem("Open");
        saveMenuItem = new JMenuItem("Save");
        
        // Add action listeners (but we won't implement them)
        openMenuItem.addActionListener(this);
        saveMenuItem.addActionListener(this);
        
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);

        // Create the Help menu
        JMenu helpMenu = new JMenu("Help");

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Set the layout manager and add components
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);

        // Set window properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Empty, as per your request
    }

    public static void main(String[] args) {
        new Example();
    }
}
