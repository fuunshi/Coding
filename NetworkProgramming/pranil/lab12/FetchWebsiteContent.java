package pranil.lab12;

import java.io.*;
import java.net.*;

public class FetchWebsiteContent {
   public static void main(String[] args) {
       try{
           URL url = new URL("https://example.com");
           URLConnection conn = url.openConnection();
           conn.connect();
           BufferedReader reader = new BufferedReader(new 
                   InputStreamReader(conn.getInputStream()));
           String line;
           while((line = reader.readLine())!=null){
               System.out.println(line);
           }
           reader.close();
       } catch (Exception e) {
           System.out.println(e);
       }
   }
}
