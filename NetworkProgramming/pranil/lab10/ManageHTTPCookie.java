package pranil.lab10;

import java.net.*;

public class ManageHTTPCookie {
   public final static String URL_STRING = "https://www.oreilly.com/";
   public static void main(String[] args) {
       CookieManager cookieManager = new CookieManager();
       CookieStore cookieStore = cookieManager.getCookieStore();


       HttpCookie fullNameCookie = new HttpCookie("fullName", "Pranil Shrestha");
       fullNameCookie.setMaxAge(300);
       fullNameCookie.setSecure(true);


       URI uri = URI.create(URL_STRING);
       cookieStore.add(uri, fullNameCookie);
       System.out.println("'fullName' Cookie Added.");
       // Get Cookie in URI
       String cookieWithURI = String.valueOf(cookieStore.get(uri).getFirst());
       System.out.println("Cookie in the URI: " + cookieWithURI);
       // Get cookies in Cookie Store
       var cookies = cookieStore.getCookies();
       System.out.println("Cookies in Cookie Store: " + cookies);
       // Get URIs in Cookie Store
       var URIs = cookieStore.getURIs();
       System.out.println("URIs with cookies in Cookie Store: " + URIs);
       // Remove Cookies
       cookieStore.removeAll();
       System.out.println("Cookies Removed.");
       System.out.println("Cookies after removal: " +  
            cookieStore.getCookies());
   }
}
