package Lab_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayRecordsGUI extends JFrame implements ActionListener {
    private JTextArea recordArea;
    private JButton displayButton;

    public DisplayRecordsGUI() {
        setTitle("Display Records");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        recordArea = new JTextArea(20, 40);
        recordArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(recordArea);

        displayButton = new JButton("Display Records");
        displayButton.addActionListener(this);

        add(scrollPane, BorderLayout.CENTER);
        add(displayButton, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == displayButton) {
            // Database connection settings
            String jdbcUrl = "jdbc:mysql://localhost:3306/myDatabase";
            String dbUsername = "root";
            String dbPassword = "";

            // Display records from the database using JDBC
            try {
                Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
                String sql = "SELECT * FROM student";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();

                StringBuilder records = new StringBuilder();
                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    String name = resultSet.getString("name");
                    String faculty = resultSet.getString("faculty");
                    records.append("ID: ").append(id).append(", Name: ").append(name).append(", Faculty: ").append(faculty).append("\n");
                }

                recordArea.setText(records.toString());

                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DisplayRecordsGUI();
        });
    }
}
