package pranil.lab14;

import java.net.*;
import java.util.Date;
public class FetchSpecificHeader {
   public static void main(String[] args) throws Exception {
       URL url = new URL("https://www.example.com");
       URLConnection conn = url.openConnection();
       System.out.println("Content Type: " + conn.getContentType());
       System.out.println("Encoding: " + conn.getContentEncoding());
       System.out.println("Date: " + new Date(conn.getDate()));
       System.out.println("Last Modified: " + new 
                        Date(conn.getLastModified()));
       System.out.println("Expires in: " + conn.getExpiration());
       System.out.println("Content size: " + conn.getContentLength());
   }}
