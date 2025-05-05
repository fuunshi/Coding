/**
 * 1.WAP to input id,name,address,age of 5 students and insert(save) into a table.
 */

package pranil.lab3;

import java.sql.*;
import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/my_db", user = "root", pass = "rootpass";
        String query = "INSERT INTO Students (id, name, address, age) VALUES (?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = con.prepareStatement(query);
             Scanner sc = new Scanner(System.in)) {
            
            for (int i = 0; i < 5; i++) {
                System.out.println("Student " + (i + 1));
                System.out.print("ID: "); int id = sc.nextInt();
                sc.nextLine();  // Consume newline
                System.out.print("Name: "); String name = sc.nextLine();
                System.out.print("Address: "); String addr = sc.nextLine();
                System.out.print("Age: "); int age = sc.nextInt();
                
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, addr);
                ps.setInt(4, age);
                ps.executeUpdate();
            }
            System.out.println("Data inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
