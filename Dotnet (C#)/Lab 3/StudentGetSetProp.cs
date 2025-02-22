using System;

class Student {
    public string Name { get; set; }
    public int Age { get; set; }
    public string Faculty { get; set; }
}

class Test {
    public static void Main() {
        Student s = new Student();
        s.Name = "John";
        s.Age = 20;
        s.Faculty = "BCA";

        Console.WriteLine(s.Name + " is of age: " + s.Age + " who studies under: " + s.Faculty);
    }
}