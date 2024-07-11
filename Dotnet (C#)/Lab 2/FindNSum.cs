using System;

class FindNSum {
    static void Main(string[] args) {
        Console.Write("Enter the size of an array: ");
        int n = int.Parse(Console.ReadLine());
        int[] arr = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            Console.Write("Enter number at " + (i+1) + " place: ");
            arr[i] = int.Parse(Console.ReadLine());
            sum += arr[i];
        }
        
        Console.WriteLine("The sum of the numbers: " + sum);
    }
}
