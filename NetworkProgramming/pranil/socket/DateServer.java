/**
 * Write a server side program for daytime service using socket.
 */

package pranil.socket;

import java.io.*;
import java.net.*;

public class DateServer {
    public static void main(String[] args) throws IOException {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server is listening on port 1234");
            Socket client = serverSocket.accept();
            PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
            writer.println(new java.util.Date().toString());
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}