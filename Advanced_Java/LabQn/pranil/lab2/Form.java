/**
 * 5. Create a swing frame that contains 1 text field for name, 1 drop down list for faculty, 
 * 2 radio buttons for gender (Male,Female), 3 check boxes for hobbies("Music","Dance","Sports"), 
 * 1 list box for languages known and a submit button. Use absolute layout (null layout).
 */
package pranil.lab2;

import javax.swing.*;

public class Form {
    public static void main(String[] a) {
        JFrame f = new JFrame("Form");
        f.setLayout(null);

        JTextField name = new JTextField();
        name.setBounds(100, 20, 150, 25);

        String[] fac = {"Science", "Management", "Arts"};
        JComboBox<String> faculty = new JComboBox<>(fac);
        faculty.setBounds(100, 60, 150, 25);

        JRadioButton m = new JRadioButton("Male"), fe = new JRadioButton("Female");
        m.setBounds(100, 100, 70, 25); fe.setBounds(170, 100, 80, 25);
        ButtonGroup g = new ButtonGroup(); g.add(m); g.add(fe);

        JCheckBox c1 = new JCheckBox("Music"), c2 = new JCheckBox("Dance"), c3 = new JCheckBox("Sports");
        c1.setBounds(100, 140, 80, 25); c2.setBounds(180, 140, 80, 25); c3.setBounds(260, 140, 80, 25);

        String[] langs = {"Java", "Python", "C++", "JS"};
        JList<String> list = new JList<>(langs);
        JScrollPane sp = new JScrollPane(list);
        sp.setBounds(100, 180, 150, 60);

        JButton submit = new JButton("Submit");
        submit.setBounds(130, 260, 100, 30);

        f.add(name); f.add(faculty); f.add(m); f.add(fe);
        f.add(c1); f.add(c2); f.add(c3); f.add(sp); f.add(submit);

        f.setSize(400, 350); f.setDefaultCloseOperation(3); f.setVisible(true);
    }
}
