// Write a java program to list all network interfaces on a system. For each network interface, print the following information:

package pranil.lab2;

import java.net.*;
import java.util.*;
import java.io.*;


public class ListAllNetworkInterface{
    public static void main (String[] args) throws IOException {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while(networkInterfaces.hasMoreElements()){
            NetworkInterface networkInterface = networkInterfaces.nextElement();
            System.out.println("NIC Name: " + networkInterface.getName());
            System.out.println("NIC Display Name: " + networkInterface.getDisplayName());
        }
    }
}