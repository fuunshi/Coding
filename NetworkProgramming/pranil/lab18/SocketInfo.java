package pranil.lab18;

import java.io.IOException;
import java.net.*;

public class SocketInfo {
   public static void main(String[] args) throws IOException {
       Socket socket = new Socket("www.google.com", 80);
       SocketAddress remoteSocket = socket.getRemoteSocketAddress();
       SocketAddress localSocket = socket.getLocalSocketAddress();
       System.out.println("Remote Socket: " + remoteSocket);
       System.out.println("Local Socket: " + localSocket);
   }
}
