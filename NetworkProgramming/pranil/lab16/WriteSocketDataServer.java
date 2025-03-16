package pranil.lab16;

import java.io.*;
import java.net.*;

public class WriteSocketDataServer {
   public static void main(String[] args) throws Exception {
       ServerSocket serverSocket = new ServerSocket(1234);
       Socket clientSocket = serverSocket.accept();


       BufferedReader in = new BufferedReader(new 
        InputStreamReader(clientSocket.getInputStream()));
       String clientMessage = in.readLine();
       System.out.println("Client message: " + clientMessage);


       clientSocket.close();
       serverSocket.close();
   }
}
