/**
 *  3. WAP to input new age and id and update the age for given id.
 */

package pranil.lab3;

import java.sql.*;
import java.util.Scanner;

public class UpdateAge {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/my_db", user = "root", pass = "rootpass";
        String query = "UPDATE Students SET age = ? WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = con.prepareStatement(query);
             Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            System.out.print("Enter new age: ");
            int newAge = sc.nextInt();

            ps.setInt(1, newAge);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Age updated successfully.");
            } else {
                System.out.println("No student found with the given ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
