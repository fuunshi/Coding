package Lab_1;

import java.util.Scanner;

public class SumOfCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any 3 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double sum = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
        System.out.println("Sum of Cubes of given number is " + sum);
    }
}
