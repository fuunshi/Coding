/**
 * Write a java program to get different parts of URI og given URI
 * http://www.xml.com/pub/a/2003/09/17/stax.html#id=_hbc
 */

package pranil.lab3;

 import java.net.*;

 public class URIParsing {
    public static void main(String[] args) {
        String str = "http://www.xml.com/pub/a/2003/09/17/stax.html#id=_hbc";
        URI uri = URI.create(str);
        System.out.println(uri.normalize().toString());
        System.out.println("Scheme = " + uri.getScheme());
        System.out.println("Scheme Specific Part = " + uri.getSchemeSpecificPart());
        System.out.println("Raw User Info = " + uri.getFragment());
        System.out.println("USer Info = " + uri.getUserInfo());
        System.out.println("Authority = " + uri.getAuthority());
        System.out.println("Host = " + uri.getHost());
        System.out.println("Path = " + uri.getPath());
        System.out.println("Port = " + uri.getPort());
        System.out.println("Query = " + uri.getQuery());
    }
 }