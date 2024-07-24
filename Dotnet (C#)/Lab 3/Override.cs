using System;

class Person {
    string firstName, lastName;
    int age;

    public Person(string fn, string ln, int a) {
        firstName = fn;
        lastName = ln;
        age = a;
    }

    public void ShowInfo() {
        Console.WriteLine("Name: " + firstName + " " + lastName + ", Age: " + age);
    }
}

class Student : Person {
    string faculty;

    public Student(string fn, string ln, int a, string f) : base(fn, ln, a) {
        faculty = f;
    }

    public override void ShowInfo() {
        base.ShowInfo();
        Console.WriteLine("Faculty: " + faculty);
    }
}

class Teacher : Person {
    double salary;

    public Teacher(string fn, string ln, int a, double s) : base(fn, ln, a) {
        salary = s;
    }

    public override void ShowInfo() {
        base.ShowInfo();
        Console.WriteLine("Salary: " + salary);
    }
}

class Test {
    public static void Main() {
        Student s = new Student("Ram", "Doe", 20, "Computer Science");
        Teacher t = new Teacher("Hari", "Smith", 35, 50000);

        s.ShowInfo();
        t.ShowInfo();
    }
}
