package pranil.lab2;

import java.net.*;
public class GetterMethods {
   public static void main(String[] args) throws UnknownHostException {
       InetAddress address = InetAddress.getByName("www.fohss.tu.edu.np");
       System.out.println("Canonical Host Name: " + address.getCanonicalHostName());
       System.out.println("Host Name: " + address.getHostName());
       System.out.println("Host Address: " + address.getHostAddress());
       System.out.print("Address: ");
       byte[] addresses = address.getAddress();
       for(byte addr : addresses) {
           System.out.print(Byte.toUnsignedInt(addr) + ".");
       }
   }
}
