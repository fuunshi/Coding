package pranil.lab5;

import java.rmi.Naming;

public class MultiplyClient {
    public static void main(String[] args) {
        try {
            Multiply stub = (Multiply) Naming.lookup("//localhost/Multiply");
            double num1 = 5.0;
            double num2 = 10.0;
            double product = stub.getProduct(num1, num2);
            System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
