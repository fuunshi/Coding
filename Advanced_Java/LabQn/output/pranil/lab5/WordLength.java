package pranil.lab5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface WordLength extends Remote {
    int getWordLength(String word) throws RemoteException;
}
