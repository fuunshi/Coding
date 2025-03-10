package JDBC;

import java.sql.*;

class InsertRecord {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/mydatabase";  
        String user = "myuser";
        String password = "mypassword";
        try {

            Connection con = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO student (id, name, faculty) VALUES (3, 'Ram', 'BCA')";
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            System.out.println("Record inserted successfully");
            stmt.close();
            con.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());  // Improved error message
        }
    }
}
