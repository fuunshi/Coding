package pranil.lab3;

import java.net.*;
public class CheckAddress {
   public static void main(String[] args) throws UnknownHostException {
       InetAddress address = InetAddress.getByName("127.0.0.1");
       System.out.println(address + " is a loop-back address: " +        address.isLoopbackAddress());
       address = InetAddress.getByName("192.168.1.65");
       System.out.println(address + " is a Site local address: " + address.isSiteLocalAddress());
       address = InetAddress.getByName("224.0.0.1");
       System.out.println(address + " is a Multicast address: " + address.isMulticastAddress());
       address = InetAddress.getByName("0.0.0.0");
       System.out.println(address + " is any local address: " + address.isAnyLocalAddress());
   }}
