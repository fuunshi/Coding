// WAP to fubd sum of first N natural numbers

using System;

class sumOfNumbers {
    static void Main(string[] args) {
        Console.Write("Enter a positive integer n: ");
        int n = int.Parse(Console.ReadLine());

        if (n < 1) {
            Console.WriteLine("Please enter a positive integer.");
        } else {
            int sum = n * (n + 1) / 2;

            Console.WriteLine("Sum of first " + n + " natural numbers is: " + sum);
        }
    }
}
