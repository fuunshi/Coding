/**
 * Write a program to read data from server using socket.
 */

package pranil.socket;

import java.net.*;
import java.io.*;

public class ServerRead {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 1234);
        BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String line = reader.readLine();
        System.out.println(line);
    }
}