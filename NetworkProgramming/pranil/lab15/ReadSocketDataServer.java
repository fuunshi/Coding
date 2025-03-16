package pranil.lab15;

import java.io.*;
import java.net.*;
public class ReadSocketDataServer {
   public static void main(String[] args) throws IOException {
       ServerSocket serverSocket = new ServerSocket(1234);
       Socket clientSocket = serverSocket.accept();
       System.out.println("Connected to Client");

       PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
       out.println("Hello from server");

       clientSocket.close();
       serverSocket.close();
   }
}
