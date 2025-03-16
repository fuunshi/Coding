/**
 * Write a program to scan local TCP ports from 1024 to up
 */

package pranil.socket;

import java.io.IOException;
import java.net.Socket;

public class PortScanning {
    public static void main(String[] args) {
        for (int port = 1024; port <= 65535; port++) {
            try {
                Socket socket = new Socket("localhost", port);
                System.out.println("Port " + port + " is in use");
            } catch (IOException e) {
                continue;
            }
        }
    }
}