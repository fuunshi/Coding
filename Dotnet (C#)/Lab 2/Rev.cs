using System;

class Rev {
    static void Main(string[] args) {
        int number = 12345;
        int reversedNumber = reverse(number);
        Console.WriteLine("Reverse of " + number + " is " + reversedNumber);
    }

    static int reverse(int n) {
        int reversed = 0;
        
        while (n != 0) {
            int remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;
        }
        
        return reversed;
    }
}
