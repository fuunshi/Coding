package pranil.lab5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CircleArea extends Remote {
    double getArea(double radius) throws RemoteException;
}
