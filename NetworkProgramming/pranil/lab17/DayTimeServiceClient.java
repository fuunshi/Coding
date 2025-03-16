package pranil.lab17;

import java.io.*;
import java.net.Socket;
public class DayTimeServiceClient {
   public static void main(String[] args) throws IOException {
       Socket socket = new Socket("localhost", 1234);
       BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
       String serverResponse = in.readLine();
       System.out.println("Server Response: " + serverResponse);
       socket.close();
   }
}
