/**
 * 6. Create a swing frame where we can provide input for id, name, address, age and on submit button click, the information should be saved to the database.
 */

package pranil.lab3;

import javax.swing.*;
import java.sql.*;

public class SaveStudent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Information");
        JTextField idField = new JTextField(10);
        JTextField nameField = new JTextField(10);
        JTextField addressField = new JTextField(10);
        JTextField ageField = new JTextField(10);
        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            String address = addressField.getText();
            int age = Integer.parseInt(ageField.getText());

            String query = "INSERT INTO Students (id, name, address, age) VALUES (?, ?, ?, ?)";
            try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/my_db", "root", "rootpass");
                 PreparedStatement ps = con.prepareStatement(query)) {

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, address);
                ps.setInt(4, age);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(frame, "Student added successfully!");
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error saving student.");
            }
        });

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(new JLabel("Enter ID:"));
        frame.add(idField);
        frame.add(new JLabel("Enter Name:"));
        frame.add(nameField);
        frame.add(new JLabel("Enter Address:"));
        frame.add(addressField);
        frame.add(new JLabel("Enter Age:"));
        frame.add(ageField);
        frame.add(submitButton);
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
