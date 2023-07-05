package Lab_2;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sum = 0, n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("The sum of natural numbers upto " + n + " is " + sum);
    }
}
