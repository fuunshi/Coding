package pranil.lab3;

import java.net.*;

class UrlDivider {
    public static void main(String[] args) throws MalformedURLException {
        URL url1 = new URL("https://blog.pranilshrestha.com.np:8080/path/to/resource?key1=value&key2=value2#section3");
        System.out.println(url1.toString());
        System.out.println("Different components of the URL1-");
        System.out.println("Protocol:- " + url1.getProtocol());
        System.out.println("Hostname:- " + url1.getHost());
        System.out.println("Default Port:- " + url1.getDefaultPort());
        System.out.println("Query:- " + url1.getQuery());
        System.out.println("Path:- " + url1.getPath());
        System.out.println("File:- " + url1.getFile());
        System.out.println("Reference:- " + url1.getRef());
    }
}