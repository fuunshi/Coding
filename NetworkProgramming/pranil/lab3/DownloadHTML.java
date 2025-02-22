/**
 * Write a program to download HTML page. 
 */

package pranil.lab3;

import java.io.*;
import java.net.*;

public class DownloadHTML {
    public static void main(String[] args) throws Exception {
        String page = "index.html";
        try {
            URL u = new URL("https://blog.pranilshrestha.com.np");
            URLConnection connect = u.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connect.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(page));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();
            System.out.println("Page downloaded successfully" + page);
        } catch (Exception ex) {
            System.out.println("There was an error in the process. " + ex);
        }
    }
}