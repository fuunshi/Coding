// WAP to find factorial of a number

using System;

class Factorial {
    static void Main(string[] args) {
        Console.Write("Enter a positive integer: ");
        int n = int.Parse(Console.ReadLine());

        if (n < 0) {
            Console.WriteLine("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            Console.WriteLine("Factorial of "+n+" is: "+factorial);
        }
    }
}
