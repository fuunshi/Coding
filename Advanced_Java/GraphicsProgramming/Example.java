

public class Example extends JPanel {
    public void paint(Graphics g) {
        Font f = new Font("Algerian", Font.BOLD.26);
        g.setFont(f);
        g.setColor(Color.BLUE);
        g.drawString("Welcome", 50, 100);
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(500, 500);
    }
}
