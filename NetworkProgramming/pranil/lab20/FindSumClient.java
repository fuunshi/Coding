package pranil.lab20;

import java.net.*;
import java.io.*;
public class FindSumClient {
   public static void main(String[] args) throws IOException {
       Socket socket = new Socket("localhost", 1234);
       PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
       BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
       int num1 = 10;
       int num2 = 16;
       out.println(num1 + " " + num2);
       String serverResponse = in.readLine();
       System.out.println("Result received from server: " + serverResponse);
       socket.close();
   }
}
