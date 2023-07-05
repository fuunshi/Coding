package Lab_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("________________________");
        System.out.println("        Calculator      ");
        System.out.println("________________________");
        System.out.print("Enter Two Numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Your Choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.printf("%d + %d = %d", a, b, a + b);
                break;
            case 2:
                System.out.printf("%d - %d = %d", a, b, a - b);
                break;
            case 3:
                System.out.printf("%d * %d = %d", a, b, a * b);
                break;
            case 4:
                System.out.printf("%d / %d = %d", a, b, (float) a / b);
                break;
            default:
            System.out.println("INVALID CHOICE.");
        }
    }
}
