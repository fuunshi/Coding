using System;

abstract class Shape {
    protected int dim1, dim2;

    public Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract void Area();
}

class Rectangle:Shape {

    public Rectangle(int dim1, int dim2) : base(dim1, dim2) {}

    public override void Area() {
        Console.WriteLine("Area of Rectangle is: " + (dim1 * dim2));
    }
}

class Triangle:Shape {

    public Triangle(int dim1, int dim2) : base(dim1, dim2) {}

    public override void Area() {
        Console.WriteLine("Area of Triangle is: " + (0.5 * dim1 * dim2));
    }
}

class Test {
    static void Main() {
        Rectangle r = new Rectangle(10, 12);
        Triangle t = new Triangle(10, 12);

        r.Area();
        t.Area();
    }
}


