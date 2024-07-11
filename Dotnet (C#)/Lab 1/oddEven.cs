// WAP to input a number and check odd/even

using System;

class oddEven {
    static void Main(string[] args) {
        Console.WriteLine("Enter a Number:");
        int num = int.Parse(Console.ReadLine());
        if (num % 2 == 0) {
            Console.WriteLine("Even");
        } else {
            Console.WriteLine("Odd");
        }
    }
}