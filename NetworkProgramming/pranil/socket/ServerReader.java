package pranil.socket;

import java.io.*;
import java.net.*;

public class ServerReader {
    public static void main(String[] args) throws IOException {
        try {

        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Server is listening on port 1234");
        Socket client = serverSocket.accept();
        BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String line = reader.readLine();
        System.out.println(line);
        serverSocket.close();
        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
