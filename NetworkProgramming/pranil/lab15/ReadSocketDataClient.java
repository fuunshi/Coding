package pranil.lab15;

import java.io.*;
import java.net.Socket;
public class ReadSocketDataClient {
   public static void main(String[] args) throws IOException {
       Socket clientSocket = new Socket("localhost", 1234);
       BufferedReader in = new BufferedReader(new 
          InputStreamReader(clientSocket.getInputStream()));


       String serverResponse = in.readLine();
       System.out.println("Server Message: " + serverResponse);


       clientSocket.close();
   }
}
