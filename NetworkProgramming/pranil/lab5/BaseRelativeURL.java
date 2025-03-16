package pranil.lab5;

import java.net.*;
public class BaseRelativeURL {
   public static void main(String[] args) throws MalformedURLException {
       String baseUrl = "https://samriddhicollege.edu.np/wp-content/uploads/2019/09/";
       String relativeUrl = "Networking_Programming-Syllabus.zip";
       URL baseURL = new URL(baseUrl);
       URL resolvedRelativeURL = new URL(baseURL, relativeUrl);
       System.out.println("Base URL: " + baseURL);
       System.out.println("Relative URL: " + relativeUrl);
       System.out.println("Resolved Relative URL: " + resolvedRelativeURL);
   }
}
