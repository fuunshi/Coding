using System;

class Area {
    private int l, b;

    public Area(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int GetArea() {
        return l * b;
    }
}

class Program {
    public static void Main() {
        Console.Write("Enter length of rectangle: ");
        int length = Convert.ToInt32(Console.ReadLine());
        
        Console.Write("Enter breadth of rectangle: ");
        int breadth = Convert.ToInt32(Console.ReadLine());
        
        Area rect = new Area(length, breadth);
        int area = rect.GetArea();
        
        Console.WriteLine("Area of rectangle with length "+ length " and breadth " + breadth + " is: " + area);
    }
}
