using System;

class FuncOdd {
    static void Main(string[] args) {
        int num = 9;
        check(num);
    }

    static void check(int n) {
        if (n % 2 == 0) {
            Console.WriteLine(n + " is even.");
        } else {
            Console.WriteLine(n + " is odd.");
        }
    }
}