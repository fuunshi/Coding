package pranil.lab3;

import java.net.*;
import java.io.*;

class ReadUrlInputStream {
    public static void main(String[] args) throws Exception {
        try {
            URL u = new URL("https://blog.pranilshrestha.com.np");

            InputStream in = u.openStream();
            int c;
            while ((c = in.read()) != -1) {
                System.out.write(c);
            }
                in.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}