import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Auth {
    public static void main(String[] args) {
        // Create the frame for the login window
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Set size of the frame
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        // Create the panel to hold all the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2)); // Set a grid layout with 3 rows and 2 columns

        // Create username label and text field
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        // Create password label and text field
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        // Create login button
        JButton loginButton = new JButton("Login");

        // Add components to the panel
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Empty label to position the button
        panel.add(loginButton);

        // Add the panel to the frame
        frame.add(panel);

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Simulate login check (you can replace this with real logic)
                if (isUserValid(username,password)) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Set the frame to be visible
        frame.setVisible(true);

       
    }

     private static boolean isUserValid(String username, String password) {
        String dbURL = "jdbc:mysql://localhost:3306/mydatabase"; 
        String dbUsername = "myuser"; 
        String dbPassword = "mypassword"; 

        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
                 PreparedStatement stmt = conn.prepareStatement(query)) {

                stmt.setString(1, username);
                stmt.setString(2, password);

                ResultSet rs = stmt.executeQuery();
                return rs.next(); 

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database connection error.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(ClassNotFoundException ex) {
                ex.printStackTrace();

        }
        return false;

    }
}