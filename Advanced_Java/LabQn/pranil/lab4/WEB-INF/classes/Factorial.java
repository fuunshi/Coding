/**
 * 4. Create a servlet to read a number from HTML and find its factorial.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/Factorial")
public class Factorial extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    int n = Integer.parseInt(req.getParameter("num"));
    long fact = 1;
    for(int i = 1; i <= n; i++) fact *= i;
    out.println("Factorial of " + n + " is " + fact);
  }
}
