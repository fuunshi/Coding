// WAP to input radius of circle and find its area

using System;

class circleArea {
    static void Main(string[] args) {
        Console.Write("Enter the radius of circle: ");
        double radius = double.Parse(Console.ReadLine());
        Console.WriteLine("The area of circle is: " + (Math.PI * radius * radius));
    }
}