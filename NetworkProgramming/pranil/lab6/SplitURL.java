package pranil.lab6;

import java.net.*;
public class SplitURL {
   public static void main(String[] args) throws MalformedURLException {
       URL url = new URL("https://blog.pranilshrestha.com.np:8080/new/index.html?user=pranil#all");
       System.out.println("URL: " + url.toString());
       System.out.println("Protocol: " + url.getProtocol());
       System.out.println("Host: " + url.getHost());
       System.out.println("Port: " + url.getPort());
       System.out.println("Path: " + url.getPath());
       System.out.println("Query: " + url.getQuery());
       System.out.println("File: " + url.getFile());
       System.out.println("Reference: " + url.getRef());
   }}
