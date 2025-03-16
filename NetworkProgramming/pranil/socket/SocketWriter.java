/**
 * Write a java program to write data to server using socket.
 */

package pranil.socket;

import java.net.*;
import java.io.*;

public class SocketWriter {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 1234);
        OutputStream output = client.getOutputStream();
        PrintWriter writer = new PrintWriter(output, true);
        writer.println("Hello from the other side");
        client.close();
    }
}