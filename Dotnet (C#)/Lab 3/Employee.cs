using System;

class Employee {
    public string Name { get; set; }        // Use Manual Getters and Setters if following question
    public int Age { get; set; }
    public int Salary { get; set; }
}

class Test {
    static void Main() {
        Employee emp = new Employee();

        // Testing getters and setters
        emp.Name = "John Doe";
        emp.Age = 30;
        emp.Salary = 50000;

        Console.WriteLine("Name: " + emp.Name);
        Console.WriteLine("Age: " + emp.Age);
        Console.WriteLine("Salary: " + emp.Salary);
    }
}
