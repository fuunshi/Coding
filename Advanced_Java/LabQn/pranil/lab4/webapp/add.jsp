<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<body>
  <form method="get">
    Number 1: <input type="text" name="a"><br>
    Number 2: <input type="text" name="b"><br>
    <input type="submit" value="Add">
  </form>

  <%
    String aStr = request.getParameter("a");
    String bStr = request.getParameter("b");
    if (aStr != null && bStr != null) {
      try {
        int a = Integer.parseInt(aStr);
        int b = Integer.parseInt(bStr);
        out.println("Sum: " + (a + b));
      } catch (NumberFormatException e) {
        out.println("Please enter valid numbers.");
      }
    }
  %>
</body>
</html>
