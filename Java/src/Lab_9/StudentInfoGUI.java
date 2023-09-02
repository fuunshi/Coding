package Lab_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentInfoGUI extends JFrame implements ActionListener {
    private JTextField idField, nameField, facultyField;
    private JButton saveButton;

    public StudentInfoGUI() {
        setTitle("Student Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        idField = new JTextField(10);
        nameField = new JTextField(20);
        facultyField = new JTextField(15);
        saveButton = new JButton("Save");
        saveButton.addActionListener(this);

        add(new JLabel("ID:"));
        add(idField);
        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Faculty:"));
        add(facultyField);
        add(saveButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            String id = idField.getText();
            String name = nameField.getText();
            String faculty = facultyField.getText();

            // Database connection settings
            String jdbcUrl = "jdbc:mysql://localhost:3306/myDatabase";
            String dbUsername = "root";
            String dbPassword = "";

            // Save the information to the database using JDBC
            try {
                Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
                String sql = "INSERT INTO student (id, name, faculty) VALUES (?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, faculty);
                preparedStatement.executeUpdate();

                JOptionPane.showMessageDialog(this, "Student information saved to the database.");

                preparedStatement.close();
                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StudentInfoGUI();
        });
    }
}
