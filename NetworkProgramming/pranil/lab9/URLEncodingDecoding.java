package pranil.lab9;

import java.net.URLDecoder;
import java.net.URLEncoder;


public class URLEncodingDecoding {
   public static void main(String[] args) {
       String url = "https://www.ibiblio.org:8080/nywc/compositions.phtml?category=Piano#all";
       System.out.println("Url String: " + url);
       String urlEncoded = URLEncoder.encode(url);
       System.out.println("Encoded: " + urlEncoded);
       String urlDecoded = URLDecoder.decode(urlEncoded);
       System.out.println("Decoded: " + urlDecoded);
   }
}
