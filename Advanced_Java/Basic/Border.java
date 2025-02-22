import javax.swing.*;
import java.awt.*;

class Border{
    public static void main(String[] args){
        
	JFrame jf = new JFrame();
	jf.setTitle("Border Layout");
	jf.setLocationRelativeTo(null);
	jf.setSize(300,300);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setLayout(new BorderLayout(10, 10));

	JPanel p = new JPanel();

	JButton b1 = new JButton("one");
	JButton b2 = new JButton("two");
	JButton b3 = new JButton("three");
	JButton b4 = new JButton("four");
	JButton b5 = new JButton("five");

	p.add(b1, BorderLayout.NORTH);
	p.add(b2, BorderLayout.SOUTH);
	p.add(b3, BorderLayout.EAST);
	p.add(b4, BorderLayout.WEST);
	
	jf.add(p, BorderLayout.SOUTH);
	jf.add(b5, BorderLayout.CENTER);

	jf.setVisible(true);
	}
}

