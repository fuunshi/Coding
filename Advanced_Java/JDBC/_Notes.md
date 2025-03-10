## Steps involved in JDBC Program:

1. Load the database driver
Ex: 
```java
Class.forName("drivername");
```
It throws ClassNotFoundException

2. Connect to tthe database
```java
Connection con = DriverManager.getConnection("url");
```
It throws SQL exception

3. Create sql query & execute
```java 
String sql = "Insert into ...";
Statement st = con.createStatement();
```

4. Close the connection
eg:
```java
con.close();
```
