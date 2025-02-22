import javax.swing.*;

class Absolute{
    public static void main(String[] args){
        
	JFrame jf = new JFrame();
	jf.setTitle("Absolute Positioning");
	jf.setLocationRelativeTo(null);
	jf.setSize(300,300);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setLayout(null);

    JLabel label1 = new JLabel("Name:");
    label1.setBounds(50, 50, 80, 25);
    jf.add(label1);

    JTextField textField1 = new JTextField();
    textField1.setBounds(150, 50, 100, 25);
    jf.add(textField1);

    JLabel label2 = new JLabel("Age:");
    label2.setBounds(50, 90, 80, 25);
    jf.add(label2);

    JTextField textField2 = new JTextField();
    textField2.setBounds(150, 90, 100, 25);
    jf.add(textField2);

    JLabel label3 = new JLabel("Faculty:");
    label3.setBounds(50, 130, 80, 25);
    jf.add(label3);

    String faculty[] = {"BCA", "CSIT", "Engineering"};
    JComboBox<String> comboField = new JComboBox<>(faculty);
    comboField.setBounds(150, 130, 100, 25);
    jf.add(comboField);

    JLabel label4 = new JLabel("Address:");
    label4.setBounds(50, 170, 80, 25);
    jf.add(label4);

    JTextField textField4 = new JTextField();
    textField4.setBounds(150, 170, 100, 25);
    jf.add(textField4);

    JButton button1 = new JButton("OK");
    button1.setBounds(50, 210, 100, 25);
    jf.add(button1);

    JButton button2 = new JButton("Cancel");
    button2.setBounds(160, 210, 100, 25);
    jf.add(button2);

	jf.setVisible(true);
	}
}

