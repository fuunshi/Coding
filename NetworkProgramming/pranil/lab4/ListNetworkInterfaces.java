package pranil.lab4;

import java.net.*;
import java.util.Enumeration;


public class ListNetworkInterfaces {
   public static void main(String[] args) throws SocketException {
       Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
       while(interfaces.hasMoreElements()){
           NetworkInterface ni = interfaces.nextElement();
           System.out.println(ni);
       }
   }
}
