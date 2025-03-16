package pranil.lab8;

import java.net.URI;

public class SplitURI {
   public static void main(String[] args) {
       String str = "https://www.ibiblio.org:8080/nywc/compositions.phtml?category=Piano#filter=all";
       URI uri = URI.create(str);
       System.out.println(uri.normalize().toString());
       System.out.println("Scheme: " + uri.getScheme());
       System.out.println("Scheme Specific Part: "+ uri.getSchemeSpecificPart());
       System.out.println("Raw User Info: " + uri.getFragment());
       System.out.println("User Info: " + uri.getUserInfo());
       System.out.println("Authority: " + uri.getAuthority());
       System.out.println("Host: " + uri.getHost());
       System.out.println("Path: " + uri.getPath());
       System.out.println("Port: " + uri.getPort());
       System.out.println("Query: " + uri.getQuery());
   }
}
