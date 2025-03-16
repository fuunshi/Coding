package pranil.lab19;

import java.io.IOException;
import java.net.*;
public class FindSocketInfo {
   public static void main(String[] args) {
       try {
           Socket socket = new Socket("www.oreilly.com", 80);
           System.out.println("Connected to " + socket.getInetAddress());
           System.out.println("Port: " + socket.getPort());
           System.out.println("Local Port: " + socket.getLocalPort());
           System.out.println("Local Address: " + socket.getLocalAddress());
       } catch (Exception ex) {
           System.err.println(ex);
  }}}
