/**
 * 2.WAP to input id of the student and delete the record matching that id.
 */

package pranil.lab3;

import java.sql.*;
import java.util.Scanner;

public class DeleteStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/my_db", user = "root", pass = "rootpass";
        String query = "DELETE FROM Students WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = con.prepareStatement(query);
             Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter student ID to delete: ");
            int id = sc.nextInt();
            
            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student record deleted.");
            } else {
                System.out.println("No student found with the given ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
