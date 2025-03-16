package pranil.lab20;

import java.net.*;
import java.io.*;

public class FindSumServer {
   public static void main(String[] args) throws IOException {
       ServerSocket serverSocket = new ServerSocket(1234);
       Socket socket = serverSocket.accept();
       System.out.println("Client connected via socket.");
       PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
       BufferedReader in = new BufferedReader(new 
                 InputStreamReader(socket.getInputStream()));
       String inputLine = in.readLine();
       System.out.println("Data received from client: " + inputLine);
       String[] numbers = inputLine.split(" ");
       int num1 = Integer.parseInt(numbers[0]);
       int num2 = Integer.parseInt(numbers[1]);
       int sum = num1 + num2;
       System.out.println("Sum: " + sum);
       out.println(sum);
       socket.close();
       serverSocket.close();
   }
}
