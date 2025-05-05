package pranil.lab5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;

public class MultiplyImpl extends UnicastRemoteObject implements Multiply {
    public MultiplyImpl() throws RemoteException {
        super();
    }

    public double getProduct(double num1, double num2) throws RemoteException {
        return num1 * num2;
    }

    public static void main(String[] args) {
        try {
            MultiplyImpl obj = new MultiplyImpl();
            Naming.rebind("Multiply", obj);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
