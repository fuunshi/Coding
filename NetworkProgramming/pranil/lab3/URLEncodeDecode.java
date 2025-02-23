/**
 * Write a java program to perform url encoding and decoding
 */

 package pranil.lab3;

 import java.net.*;

 public class URLEncodeDecode {
    public static void main(String[] args) throws Exception {
        String url1 = URLEncoder.encode("https://blog.pranilshrestha.com.np/hello-world/", "UTF-8");
        System.out.println(url1);
        String deurl = URLDecoder.decode(url1);
        System.out.println(deurl);
    }
 }