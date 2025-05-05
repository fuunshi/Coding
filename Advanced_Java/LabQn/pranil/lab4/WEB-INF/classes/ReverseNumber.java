/**
 * 3. Create a servlet to read a number from HTML and display its reverse.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/ReverseNumber")
public class ReverseNumber extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    int n = Integer.parseInt(req.getParameter("num"));
    int rev = 0;
    while(n != 0) {
      rev = rev * 10 + n % 10;
      n /= 10;
    }
    out.println("Reversed Number: " + rev);
  }
}
