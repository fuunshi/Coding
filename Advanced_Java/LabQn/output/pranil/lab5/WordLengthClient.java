package pranil.lab5;

import java.rmi.Naming;

public class WordLengthClient {
    public static void main(String[] args) {
        try {
            WordLength stub = (WordLength) Naming.lookup("//localhost/WordLength");
            System.out.println("Length: " + stub.getWordLength("Hello"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
