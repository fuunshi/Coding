package JDBC;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DataEntry extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField tf1, tf2;
    JComboBox tf3;
    JButton show, btn, dlt_btn, update_btn;
    DataEntry() {
        l1 = new JLabel("ID");
        tf1 = new JTextField();
        l2 = new JLabel("Name");
        tf2 = new JTextField();
        l3 = new JLabel("Faculty");
        String faculties[] = { "Science", "Management", "Humanities", "BCA" };
        tf3 = new JComboBox<String>(faculties);
        show = new JButton("Show");
        btn = new JButton("Submit");
        dlt_btn = new JButton("Delete");
        update_btn = new JButton("Update");
        l1.setFont(new Font("Arial", Font.BOLD, 16));
        l2.setFont(new Font("Arial", Font.BOLD, 16));
        l3.setFont(new Font("Arial", Font.BOLD, 16));
        tf1.setFont(new Font("Arial", Font.PLAIN, 16));
        tf2.setFont(new Font("Arial", Font.PLAIN, 16));
        tf3.setFont(new Font("Arial", Font.PLAIN, 16));
        show.setFont(new Font("Arial", Font.BOLD, 16));
        btn.setFont(new Font("Arial", Font.BOLD, 16));
        dlt_btn.setFont(new Font("Arial", Font.BOLD, 16));
        update_btn.setFont(new Font("Arial", Font.BOLD, 16));
        
        l1.setBounds(140, 50, 600, 30);
        tf1.setBounds(140, 80, 600, 30);
        l2.setBounds(140, 120, 600, 30);
        tf2.setBounds(140, 150, 600, 30);
        l3.setBounds(140, 190, 600, 30);
        tf3.setBounds(140, 220, 600, 30);
        show.setBounds(140, 270, 600, 40);
        btn.setBounds(140, 320, 600, 40);
        dlt_btn.setBounds(140, 370, 600, 40);
        update_btn.setBounds(140, 420, 600, 40);
        show.addActionListener(this);
        btn.addActionListener(this);
        dlt_btn.addActionListener(this);
        update_btn.addActionListener(this);
        tf1.addActionListener(this);
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(show);
        add(btn);
        add(dlt_btn);
        add(update_btn);
        setSize(900, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String id = tf1.getText();
        String name = tf2.getText();
        String faculty = tf3.getSelectedItem().toString();
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "myuser";
        String password = "mypassword";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            if (e.getSource() == btn) {
                insertData(id, name, faculty, con);
            } else if (e.getSource() == dlt_btn) {
                int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete?", "Exit", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    deleteData(id, con);
                }
            } else if (e.getSource() == update_btn) {
                updateData(id, name, faculty, con);
            } else if (e.getSource() == tf1) {
                String sql = "SELECT * FROM student WHERE id = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setInt(1, Integer.parseInt(id));
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    tf2.setText(rs.getString("name"));
                    tf3.setSelectedItem(rs.getString("faculty"));
                }
                pstmt.close();
                rs.close();
                con.close();
            } else if (e.getSource() == show) {
                new ShowRecords();
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void main(String[] args) {
        new DataEntry();
    }
    public static void insertData(String id, String name, String faculty, Connection con) {
        try {
            String sql = "INSERT INTO student (id, name, faculty) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(id));
            pstmt.setString(2, name);
            pstmt.setString(3, faculty);
            pstmt.executeUpdate();
            pstmt.execute(sql);
            JOptionPane.showMessageDialog(null, "Data inserted successfully!");
            pstmt.close();
            con.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public void deleteData(String id, Connection con) {
        try {
            String sql = "DELETE FROM student WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(id));
            pstmt.executeUpdate();
            pstmt.execute(sql);
            JOptionPane.showMessageDialog(this, "Data deleted successfully!");
            pstmt.close();
            con.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public void updateData(String id, String name, String faculty, Connection con) {
        try {
            String sql = "UPDATE student SET name = ?, faculty = ? WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, faculty);
            pstmt.setInt(3, Integer.parseInt(id));
            pstmt.executeUpdate();
            pstmt.execute(sql);
            JOptionPane.showMessageDialog(this, "Data updated successfully!");
            pstmt.close();
            con.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}

public class ShowRecords extends JFrame {
    
    ShowRecords() {
        try {
            setSize(800, 800);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());
            this.showTable();
            setVisible(true);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void showTable() {
        try {
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "myuser";
            String password = "mypassword";
            Connection con = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM student";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            String[] columns = {"ID", "Name", "Faculty"};
            Object[][] data = new Object[100][3];
            while (rs.next()) {
                data[rs.getRow() - 1][0] = rs.getInt("id");
                data[rs.getRow() - 1][1] = rs.getString("name");
                data[rs.getRow() - 1][2] = rs.getString("faculty");
            }
            JTable table = new JTable(data, columns);
            JScrollPane scrollPane = new JScrollPane(table);
            add(scrollPane);
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}