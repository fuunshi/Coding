/**
 * 5. Create a servlet to write cookie to user computer and then read all cookies stored in the user computer.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/CookieDemo")
public class CookieDemo extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    String name = req.getParameter("username");
    if (name != null) {
      Cookie c = new Cookie("user", name);
      res.addCookie(c);
      out.println("Cookie set!<br>");
    }

    Cookie[] cookies = req.getCookies();
    if (cookies != null) {
      out.println("All Cookies:<br>");
      for (Cookie ck : cookies)
        out.println(ck.getName() + " = " + ck.getValue() + "<br>");
    }
  }
}
