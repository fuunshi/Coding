import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyTypedEvent extends JFrame implements KeyListener {

    private JTextField t1;
    private JTextField t2;

    public KeyTypedEvent() {
        setTitle("Key Typed Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new FlowLayout());

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        add(t1);
        add(t2);

        t1.addKeyListener(this);
        t2.addKeyListener(this);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(KeyTypedEvent::new);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char ch = e.getKeyChar();
        Object source = e.getSource();

        if (source == t1 && !(Character.isLetter(ch) || ch == '_')) {
            e.consume();
        } else if (source == t2 && !Character.isDigit(ch)) {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Required method, but not used
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Required method, but not used
    }
}
