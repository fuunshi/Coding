// WAP to print prime numbers from 100 to 200

using System;

class prime {
    static void Main(string[] args) {
        Console.WriteLine("Prime numbers between 100 and 200:");
        for (int num = 100; num <= 200; num++) {
            bool isPrime = true;

            for (int i = 2; i <= Math.Sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && num > 1) {
                Console.WriteLine(num);
            }
        }
    }
}
