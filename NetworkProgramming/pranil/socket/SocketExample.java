package pranil.socket;

import java.net.*;
import java.io.*;

public class SocketExample {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("time.nist.gov", 13);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = reader.readLine();
        System.out.println(line);
    }
}