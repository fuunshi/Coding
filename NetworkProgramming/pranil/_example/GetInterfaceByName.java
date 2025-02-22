package pranil._example;

import java.net.*;

public class GetInterfaceByName {
    public static void main(String[] args) throws SocketException {
        NetworkInterface networkInterface = NetworkInterface.getByName("eth3");
        if (networkInterface != null) {
            System.out.println("NIC Name: " + networkInterface.getName());
            System.out.println("NIC Display Name: " + networkInterface.getDisplayName());
        } else {
            System.out.println("Network Interface Not Found");
        }
    }
}            