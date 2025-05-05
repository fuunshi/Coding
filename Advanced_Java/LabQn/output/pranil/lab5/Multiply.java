package pranil.lab5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Multiply extends Remote {
    double getProduct(double num1, double num2) throws RemoteException;
}
