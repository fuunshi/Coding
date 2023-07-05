package Lab_3;

import java.util.Scanner;

public class GreatSmallInTen {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");

        // Read user input and populate the array
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the greatest and smallest numbers
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < 10; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The smallest number is: " + min);
        System.out.println("The greatest number is: " + max);
    }
}
