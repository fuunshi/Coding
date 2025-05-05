/**
 * 5. create a swing frame to input id and delete the matching records. Do confirmation before deleting.
 */

package pranil.lab3;

import javax.swing.*;
import java.sql.*;

public class DeleteStudentCon {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Delete Student");
        JTextField idField = new JTextField(10);
        JButton deleteButton = new JButton("Delete");

        deleteButton.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            int option = JOptionPane.showConfirmDialog(frame, "Are you sure you want to delete student with ID " + id + "?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/my_db", "root", "rootpass");
                     PreparedStatement ps = con.prepareStatement("DELETE FROM Students WHERE id = ?")) {
                    ps.setInt(1, id);
                    int rowsAffected = ps.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(frame, "Student deleted.");
                    } else {
                        JOptionPane.showMessageDialog(frame, "No student found with the given ID.");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(new JLabel("Enter Student ID to delete:"));
        frame.add(idField);
        frame.add(deleteButton);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
