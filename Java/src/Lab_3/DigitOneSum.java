package Lab_3;

import java.util.Scanner;

public class DigitOneSum {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int num : numbers) {
            if (num % 10 == 1) {
                sum += num;
            }
        }

        System.out.println("Sum of numbers whose last digit is 1: " + sum);
    }
}
