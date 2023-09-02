package Lab_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteRecordGUI extends JFrame implements ActionListener {
    private JTextField idField;
    private JButton deleteButton;

    public DeleteRecordGUI() {
        setTitle("Delete Record");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2, 10, 10));

        idField = new JTextField(10);
        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(this);

        add(new JLabel("Enter ID to delete:"));
        add(idField);
        add(new JLabel()); // Placeholder for spacing
        add(deleteButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == deleteButton) {
            String id = idField.getText();

            // Database connection settings
            String jdbcUrl = "jdbc:mysql://localhost:3306/myDatabase";
            String dbUsername = "root";
            String dbPassword = "";

            // Delete the record from the database using JDBC
            try {
                Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
                String sql = "DELETE FROM student WHERE id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, id);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Record with ID " + id + " deleted successfully.");
                } else {
                    JOptionPane.showMessageDialog(this, "No record found with ID " + id);
                }

                preparedStatement.close();
                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DeleteRecordGUI();
        });
    }
}
