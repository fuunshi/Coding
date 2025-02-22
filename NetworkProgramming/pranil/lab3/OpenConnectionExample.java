package pranil.lab3;

// Not a lab

import java.net.*;
import java.io.*;

public class OpenConnectionExample {
    public static void main(String[] args) throws Exception {
        StringBuilder content = new StringBuilder();
        try {
            URL u = new URL("https://blog.pranilshrestha.com.np");

            URLConnection uc = u.openConnection();
            InputStream in = uc.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        } catch (Exception ex) {
            System.out.println("There was an error when in the process. Details " + ex);
        }
    }
}