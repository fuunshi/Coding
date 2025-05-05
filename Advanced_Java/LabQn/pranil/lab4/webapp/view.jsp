<%@ page import="java.sql.*" %>
<html>
<body>
<h2>Student Records</h2>
<table border="1">
  <tr>
    <th>ID</th><th>Name</th><th>Address</th><th>Faculty</th>
  </tr>

<%
  try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/my_db", "root", "rootpass");

    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM Students");

    while(rs.next()) {
%>
  <tr>
    <td><%= rs.getString("id") %></td>
    <td><%= rs.getString("name") %></td>
    <td><%= rs.getString("address") %></td>
    <td><%= rs.getString("faculty") %></td>
  </tr>
<%
    }
    con.close();
  } catch(Exception e) {
    out.println("Error: " + e.getMessage());
  }
%>
</table>
</body>
</html>
