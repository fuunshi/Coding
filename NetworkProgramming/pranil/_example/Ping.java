package pranil._example;

import java.io.IOException;
import java.net.InetAddress;

public class Ping {
    public static void main(String[] args) {
        String ipAddress = "10.10.64.158";
        try {
            InetAddress inet = InetAddress.getByName(ipAddress);
            System.out.println("Sending Ping Request to " + ipAddress);
            if (inet.isReachable(5000)) {
                System.out.println(ipAddress + " is reachable.");
            } else {
                System.out.println(ipAddress + " is not reachable.");
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}