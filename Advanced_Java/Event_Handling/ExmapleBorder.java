import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExampleBorder {
	public static void main(String[] args) {
		JMenu file;
		JMenuBar mba;
		JMenuItem New;
		JDesktopPane dp;
		JFrame jf = new JFrame();
		jf.setLayout(new BorderLayout());
		jf.setSize(500, 500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mba = new JMenuBar();
		
