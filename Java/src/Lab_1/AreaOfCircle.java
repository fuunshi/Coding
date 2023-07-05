package Lab_1;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double pi = 3.14159265;
        System.out.print("Enter the radius: ");
        int radius = scanner.nextInt();
        System.out.println("The Radius of circle is " + pi * radius * radius);
    }
}
