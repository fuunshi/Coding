package pranil.lab5;

import java.rmi.Naming;
import java.util.Scanner;

public class CircleAreaClient {
    public static void main(String[] args) {
        try {
            CircleArea circleArea = (CircleArea) Naming.lookup("rmi://localhost/CircleArea");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();
            System.out.println("Area: " + circleArea.getArea(radius));
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
