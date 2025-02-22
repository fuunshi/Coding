// WAP to input two numbers and perform addition, substraction, multiplication and division

using System;

class Calculator {
    static void Main(string[] args) {
        Console.WriteLine("Enter Two Numbers: ");
        int numOne = int.Parse(Console.ReadLine());
        int numTwo = int.Parse(Console.ReadLine());
        Console.WriteLine("1. Addition");
        Console.WriteLine("2. Substraction");
        Console.WriteLine("3. Multiplication");
        Console.WriteLine("4. Division");
        Console.Write("Enter your choice: ");
        int choice = int.Parse(Console.ReadLine());
        switch(choice) {
            case 1:
                Console.WriteLine("The sum is: " + (numOne + numTwo));
                break;
            case 2:
                Console.WriteLine("The substraction is: " + (numOne - numTwo));
                break;
            case 3:
                Console.WriteLine("The Multiplication is: " + (numOne * numTwo));
                break;
            case 4:
                double numOneD = (double)numOne;
                double numTwoD = (double)numTwo;
                Console.WriteLine("The division is: " + (numOneD / numTwoD));
                break;
            default:
                Console.WriteLine("Invalid Choice. Exiting..");
                break;
        }
        return;
    }
}