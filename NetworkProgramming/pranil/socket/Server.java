package pranil.socket;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket socket = serverSocket.accept();
        OutputStream outputStream = socket.getOutputStream();
        String str = "Hello";
        byte[] byteArray = str.getBytes();
        outputStream.write(byteArray);
        outputStream.flush();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}