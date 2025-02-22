import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class MouseEventExample extends JFrame implements MouseListener {

    private JLabel label;

    public MouseEventExample() {
        setTitle("Mouse Event Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new FlowLayout());

        label = new JLabel("Click Me");
        add(label);

        label.addMouseListener(this);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited: (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MouseEventExample::new);
    }
}
