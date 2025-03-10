//*
* Write a program to handle HTTP cookie in Java using COokieManager and Hrttp COokie
* classes also retrieve and display cookie information from a specified url
*/

import java.net.*;
import java.util.*;

public class App {
    private final static String URL_STRING = "https://www.example.com/";

    public static void main(String[] args) {
        try {
            CookieManager cm = new CookieManager();
            CookieHandler.setDefault(cm);
            
            URL url = new URL(URL_STRING);
            URLConnection conn = url.openConnection();
            conn.getContent(); // Fetch content to store cookies

            CookieStore cs = cm.getCookieStore();
            List<HttpCookie> cookieList = cs.getCookies();

            for (HttpCookie cookie : cookieList) {
                System.out.println("Domain: " + cookie.getDomain());
                System.out.println("Max Age: " + cookie.getMaxAge());
                System.out.println("Name of Cookie: " + cookie.getName());
                System.out.println("Path: " + cookie.getPath());
                System.out.println("Value: " + cookie.getValue());
		System.out.println("Is cookie secure: " + cookie.getSecure());
		System.out.println("Value of cookie version: " + cookie.getVersion());
                System.out.println("-----------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
