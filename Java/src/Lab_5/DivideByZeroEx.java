package Lab_5;

import java.util.Scanner;

public class DivideByZeroEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt(), b = scanner.nextInt();

        try {
            int divide = a / b;
            System.out.println(a + " / " + b + " = " + divide);
        } catch (ArithmeticException e) {
            System.out.println("Divide By Zero Error! Numbers Cannot! be divided by Zeros");
        }
    }
}
