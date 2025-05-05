<%@ page import="java.util.*, Student" %>
<html>
<body>
<h2>Enter Student Details</h2>
<form method="post">
  Name: <input type="text" name="name"><br>
  Faculty: <input type="text" name="faculty"><br>
  Age: <input type="text" name="age"><br>
  <input type="submit" value="Submit">
</form>

<%
  // Retrieving the form data
  String name = request.getParameter("name");
  String faculty = request.getParameter("faculty");
  String ageStr = request.getParameter("age");

  if (name != null && faculty != null && ageStr != null) {
    try {
      int age = Integer.parseInt(ageStr);

      // Create the Student bean
      Student student = new Student(name, faculty, age);

      // Display the Student details
%>
      <h3>Student Details:</h3>
      <p>Name: <%= student.getName() %></p>
      <p>Faculty: <%= student.getFaculty() %></p>
      <p>Age: <%= student.getAge() %></p>
<%
    } catch (NumberFormatException e) {
      out.println("<p>Invalid age input.</p>");
    }
  }
%>
</body>
</html>
