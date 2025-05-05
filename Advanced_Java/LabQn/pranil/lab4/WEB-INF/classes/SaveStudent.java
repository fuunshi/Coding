/**
 * 6. Create a servlet that takes id, name, address, faculty of a student from HTML form and then save the provided information to the database.
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.sql.*;

@WebServlet("/SaveStudent")
public class SaveStudent extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    String id = req.getParameter("id");
    String name = req.getParameter("name");
    String address = req.getParameter("address");
    String faculty = req.getParameter("faculty");

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection(
        "jdbc:mysql://127.0.0.1:3306/my_db", "root", "rootpass");

      PreparedStatement ps = con.prepareStatement(
        "INSERT INTO Students(id, name, address, faculty) VALUES (?, ?, ?, ?)");
      ps.setString(1, id);
      ps.setString(2, name);
      ps.setString(3, address);
      ps.setString(4, faculty);

      int i = ps.executeUpdate();
      if (i > 0)
        out.println("Student saved successfully.");
      con.close();
    } catch (Exception e) {
      out.println("Error: " + e.getMessage());
    }
  }
}
