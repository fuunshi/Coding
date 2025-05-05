package pranil.lab5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;

public class CircleAreaImpl extends UnicastRemoteObject implements CircleArea {
    public CircleAreaImpl() throws RemoteException {
        super();
    }

    public double getArea(double radius) throws RemoteException {
        return Math.PI * radius * radius; // Area = π * r^2
    }

    public static void main(String[] args) {
        try {
            CircleAreaImpl obj = new CircleAreaImpl();
            Naming.rebind("CircleArea", obj);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
