package Lab_4;

import java.util.Scanner;

class Area {
    private int length, breadth;

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea() {
        return length *  breadth;
    }
}

public class AreaOfRect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the length and breadth of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        // Using Constructor
        Area rectangleArea = new Area(length, breadth);

        // Calculate and print the area of the rectangle
        int area = rectangleArea.returnArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
