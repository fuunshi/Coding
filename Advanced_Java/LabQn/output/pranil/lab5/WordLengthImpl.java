package pranil.lab5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;

public class WordLengthImpl extends UnicastRemoteObject implements WordLength {
    public WordLengthImpl() throws RemoteException { super(); }

    public int getWordLength(String word) throws RemoteException {
        return word.length();
    }

    public static void main(String[] args) {
        try {
            WordLengthImpl obj = new WordLengthImpl();
            Naming.rebind("WordLength", obj);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
