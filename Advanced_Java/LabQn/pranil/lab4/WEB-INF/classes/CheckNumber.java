/**
 * 1. Create a servlet to read a number provided from HTML and check odd/even.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/CheckNumber")
public class CheckNumber extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    int n = Integer.parseInt(req.getParameter("num"));
    out.println(n + " is " + (n % 2 == 0 ? "Even" : "Odd"));
  }
}
