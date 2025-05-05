/**
 * 4. Create a swing frame to input age and display the list of students whose age is more than given input.
 */

package pranil.lab3;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Scanner;

public class StudentAgeFilter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Filter Students by Age");
        JTextField ageField = new JTextField(10);
        JButton filterButton = new JButton("Filter");
        JTextArea resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        filterButton.addActionListener(e -> {
            int ageInput = Integer.parseInt(ageField.getText());
            StringBuilder result = new StringBuilder();
            String url = "jdbc:mysql://127.0.0.1:3306/my_db";
            String user = "root";
            String pass = "rootpass";
            String query = "SELECT id, name, age FROM Students WHERE age > ?";

            try (Connection con = DriverManager.getConnection(url, user, pass);
                 PreparedStatement ps = con.prepareStatement(query)) {

                ps.setInt(1, ageInput);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    result.append("ID: ").append(rs.getInt("id"))
                          .append(", Name: ").append(rs.getString("name"))
                          .append(", Age: ").append(rs.getInt("age"))
                          .append("\n");
                }

                if (result.length() == 0) {
                    result.append("No students found with age greater than ").append(ageInput);
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            resultArea.setText(result.toString());
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Enter Age:"));
        frame.add(ageField);
        frame.add(filterButton);
        frame.add(new JScrollPane(resultArea));

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
