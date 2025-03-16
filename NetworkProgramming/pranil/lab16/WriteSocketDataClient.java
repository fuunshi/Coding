package pranil.lab16;

import java.io.PrintWriter;
import java.net.Socket;

public class WriteSocketDataClient {
   public static void main(String[] args) throws Exception {
       Socket client = new Socket("localhost", 1234);
       PrintWriter out = new PrintWriter(client.getOutputStream(), true);
       out.println("Hello from client");
       client.close();
   }
}
