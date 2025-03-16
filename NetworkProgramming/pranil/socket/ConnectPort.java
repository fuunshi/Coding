package pranil.socket;

import java.net.*;
import java.io.*;

public class ConnectPort {
    public static void main(String[] args) {
        try {
            String remotehostaddress = "www.example.com";
            int remotePort = 80;
            InetAddress address = InetAddress.getByName("0.0.0.0");
            int localPort = 5000;
            Socket socket = new Socket(remotehostaddress, remotePort, address, localPort);
            System.out.println("Connected to " + remotehostaddress + " on port " + remotePort);
        } catch (IOException e) {
            System.out.println("Error connecting to server: " + e.getMessage());
        }
    }
}