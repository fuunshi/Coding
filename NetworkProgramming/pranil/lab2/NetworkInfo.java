package pranil.lab2;

import java.net.*;

public class NetworkInfo {
    public static void main(String[] args) throws Exception {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            String hostName = localHost.getHostName();
            String ipAddress = localHost.getHostAddress();

            NetworkInterface network = NetworkInterface.getByInetAddress(localHost);
            byte[] mac = network.getHardwareAddress();

            // Print Details
            System.out.println("Host Name: " + hostName);
            System.out.println("IP Address: " + ipAddress);
            System.out.print("MAC Address: ");
            if (mac != null) {
                for (int i = 0; i < mac.length; i++) {
                    System.out.printf("%02X", mac[i]);
                }
            }
        } catch (UnknownHostException e) {
            System.out.println("Unable to determine this host's address");
        }
    }
}