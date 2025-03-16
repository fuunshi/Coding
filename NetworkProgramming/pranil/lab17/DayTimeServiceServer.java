package pranil.lab17;

import java.io.*;
import java.net.*;
import java.util.Date;
public class DayTimeServiceServer {
   public static void main(String[] args) throws IOException {
       ServerSocket serverSocket = new ServerSocket(1234);
       Socket clientSocket = serverSocket.accept();
       System.out.println("Connected to client.");
       String now = new Date().toString();
       PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
       out.println(now);
       clientSocket.close();
       serverSocket.close();
   }
}
