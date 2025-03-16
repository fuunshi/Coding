package pranil.lab1;

import java.net.*;
public class LocalAddressHostname {
   public static void main(String[] args) throws UnknownHostException {
       InetAddress address = InetAddress.getLocalHost();
       System.out.println(address);
       System.out.println(address.getHostName());
   }
}
