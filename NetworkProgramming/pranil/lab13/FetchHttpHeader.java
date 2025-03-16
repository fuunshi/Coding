package pranil.lab13;

import java.net.*;
import java.util.*;
public class FetchHttpHeader{
   public static void main(String[] args) throws Exception  {
       URL url = new URL("https://www.example.com/");
       URLConnection uc = url.openConnection();
       Map<String, List<String>> header = uc.getHeaderFields();
       for (Map.Entry<String, List<String>> mp: header.entrySet()){
           System.out.print(mp.getKey() + " : ");
           System.out.print(mp.getValue().toString());
       }
   }
}
