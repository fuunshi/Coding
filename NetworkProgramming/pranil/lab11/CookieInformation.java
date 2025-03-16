package pranil.lab11;

import java.net.*;
import java.util.List;

public class CookieInformation {
   private final static String URL_STRING = "https://www.nepalarmy.mil.np/";
   public static void main(String[] args) throws Exception {
       CookieManager cookieManager = new CookieManager();
       CookieHandler.setDefault(cookieManager);
       URL url = new URL(URL_STRING);
       URLConnection connection = url.openConnection();
       connection.getContent();


       CookieStore cookieStore = cookieManager.getCookieStore();
       List<HttpCookie> cookieList = cookieStore.getCookies();
       // iterate through Http cookies
       for(HttpCookie cookie: cookieList){
           System.out.println();
           System.out.println("Domain " + cookie.getDomain());
           System.out.println("Max age: " + cookie.getMaxAge());
           System.out.println("Name of cookies: " + cookie.getName());
           System.out.println("Server path: " + cookie.getPath());
           System.out.println("Is secure? " + cookie.getSecure());
           System.out.println("Value: " + cookie.getValue());
           System.out.println("Version: " + cookie.getVersion());
           System.out.println("Cookie expired? " + cookie.hasExpired());
           System.out.println("Http only? " + cookie.isHttpOnly());
       }
   }
}
