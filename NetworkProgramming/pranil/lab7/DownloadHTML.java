package pranil.lab7;

import java.io.*;
import java.net.*;

public class DownloadHTML {
   public static void main(String[] args) {
       String fileName = "index.html";
       try {
           URL url = new URL("https://www.example.com");
           URLConnection conn = url.openConnection();
           BufferedReader reader = new BufferedReader(new 
                     InputStreamReader(conn.getInputStream()));
           BufferedWriter writer = new BufferedWriter(new 
                     FileWriter(fileName));
           String line;
           while((line=reader.readLine()) != null){
               writer.write(line);
               writer.newLine();
           }
           writer.close();
           reader.close();
           System.out.println("Page downloaded");
       } catch (Exception e) {
           System.out.println(e);
       }
   }
}
