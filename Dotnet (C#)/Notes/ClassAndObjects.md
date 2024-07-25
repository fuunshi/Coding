# Method OverLoading

- Defining more than 1 methods with the same method name in a class but with different parameters is called method overloading.
- The method to be called is decided according to the number of arguments during compile time. Hence, it is also called compile-time polymorphism, early binding, static binding.

**Example:**
```csharp
class Person {
    string name;
    int age;

    public void Set() {
        name = "Hari";
        age = 20;
    }

    public void Set(string name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Show() {
        Console.WriteLine("Name: {0}, Age: {1}", name, age);
    }
}

class Test {
    static void Main(string[] args) {
        Person p = new Person();
        p.Set();   
        p.Show();
        Person p1 = new Person();
        p1.Set("Hari", 20);
        p1.Show();
    }
}
```

---

# Constructor

- A constructor is a special method that is used to initialize the instance variables.
- A constructor has the same name as the class name and it does not return any value, not even `void`.
- A constructor is called when an object is created.

**Example:**
```csharp
using System;

class Person {
    string name;
    int age;

    public Person() {
        name = "Hari";
        age = 20;
    }

    public void Show() {
        Console.WriteLine("Name: {0}, Age: {1}", name, age);
    }
}

class Test {
    static void Main(string[] args) {
        Person p = new Person();
        p.Show();
    }
}
```

---

## Types of Constructor:

1. **Default Constructor**
2. **Constructor without Parameter**
3. **Constructor with Parameter**
4. **Private Constructor**
5. **Copy Constructor**
6. **Static Constructor**

---

### Default Constructor

- It is the constructor that is created automatically by the runtime if a constructor is not specified in the program.
- It initializes the instance variables with default values like 0 for `int`, 0.0 for floating point, empty (nothing) for `string`.

**Example:**
```csharp
class Person {
    string name;
    int age;

    static void Main() {
        Person p = new Person();
        Console.WriteLine(p.name + " " + p.age);
    }
}
```

**Points To Be Noted:** Since a constructor is not specified, the default constructor is automatically created which initializes `name` and `age` with empty and 0 respectively.

---

### Constructor without Parameter

- It initializes the instance variables with the values assigned inside the constructor.

**Example:**
```csharp
class Person {
    string name;
    int age;
    public Person() {
        name = "John";
        age = 25;
    }
    static void Main() {
        Person p = new Person();
        Console.WriteLine(p.name + " " + p.age);
    }
}
```

---

### Constructor without Parameter

- It initializes the instance variables with the values passed as arguement during object creation.

**Example:**
```csharp
using System;
class Person {
    string name;
    int age;
    public Person(string n, int a) {
        name = n;
        age = a;
    }
    static void Main() {
        Person p = new Person("John", 25);
        Console.WriteLine(p.name + " " + p.age);
    }
}
```

---

### Private Constructor

A private constructor allows the creation of object only within the same class, not in other classes.

**Example:**
```cs
using System;

public class Person
{
    private string name;
    private int age;

    private Person(string name, int age)
    {
        this.name = name;
        this.age = age;
        Console.WriteLine("Private Constructor");
    }

    public static Person CreatePerson(string name, int age)
    {
        return new Person(name, age);
    }

    public void Show()
    {
        Console.WriteLine("Name: " + name + " Age: " + age);
    }

    public static void Main()
    {
        Person p = CreatePerson("John Doe", 30);
        p.Show();
    }
}
```

---
### Copy Constructor

- It is a constructor that creates an object by copying variables from another object.
- It is invoked by instantiating an objet and passing it, the object to be copied

**Example:**
```csharp
class Item {
    int code, price;

    public Item(int c, int p) {
        code = c;
        price = p;
    }

    public Item(Item item) {
        code = item.code;
        price = item.price;
    }

    public void Show() {
        Console.WriteLine("Code: {0}, Price: {1}", code, price);
    }
}

class Test_CopyConstructor {
    static void Main(string[] args) {
        Item item1 = new Item(100, 1000);
        Item item2 = new Item(item1);
        item2.Show();
    }
}
```

---

### Static Constructor

- A static constructor is used to initialize any static data, or to perform a particular action that needs to be performed only once. It is called automatically before the first instance(object) is created or any static members are referenced.
- It cannot have any parameter.
```csharp
class Abc {
    static Abc() {
        // Set values for static members here
    }
}
```

### Properties of static constructor

1. A static constructor doesnt take access modifers and does not have parameters.
2. A class or struct can only have one static constructor
3. Static constructors cannot be inherited or overloaded.
4. A static constructor cannot be called directly and is only meant to be called by the commman language runtime (CLR). It is invoked automatically
5. The user has no control on when the static constructor is executed in the program

---

## Destructor

- A destructor is opposite to a constructor. It is a method called when a object is no more required.
- The name of destructor is same as class name and is preceded by a tilde (~).
- A destructor has no return type and no parameters.

**Example:**
```csharp
class Fun {
    ~Fun() {
        Console.WriteLine("Destructor called");
    }
}
```

**Progranm:**
```csharp
using System;
class User {
    public User() {
        Console.WriteLine("Constructor called");
    }
    // Destructor
    ~User() {
        Console.WriteLine("Destructor called");
    }
}

class Program {
    static void Main(string[] args) {
        Details();
        GC.Collect();
    }
    public static void Details() {
        // Created an instance of the class
        User user = new User();
    }
}
```

### Properties of destructor

1. There cannot be more than one destructor in a class.
2. A destructor has no return type and has exactly the same name as the class name with a tilde symbol (~) prefixed to its name.
3. A destructor does not accept any parameters and modiferes.
4. It cannot be defined in Structores. It is only used with classes.
5. It cannot be overload or inherited.
6. It is called when the program exits or when an object is garbage collected.

**Points to noted:**
- Memory management is done dynamically in C# using garbage collector which runs on a seprate thread. Hence it is not necessary to create destructors manually by programmers.
- Finalization is the process of calling a destructor when the garbage collector reclaims an object

---

## Static Members

- In case of instance variables and instance methods, a new copy of each is created every time the class is instantiated. They are accessed using the object with dot operator.
- Static members are common to all objects and accessed without using a particular object i.e. the static member belongs to the class as a whole rather than the objects created from the class.
- They are defined as:
```csharp
static int count;   // static variable
static int Max(int x, int y) { // static variable

}
```

- Static variable and static method are also referred to as class variable and class method.

**Example:**
```csharp
using System;
class Calculation {
    public static int Max(int x, int y) {
        if (x > y) 
            return x;
        else 
            return y;
    }
}
class Test {
    static void Main(string[] args) {
        int m = Calculation.Max(5, 6)
        Console.WriteLine("Maximum is " + m);
        // Console.WriteLine("Maximum is " + Calculation.Max(5, 6));
    }
}
```

### Restriction of static method

1. They can only call other static methods directly(i.e. without creating object)
2. They can only access static data declared outside them directly.
3. They cannot refer to "this" or "base" in any way.

---

**Read-only members:**
```csharp
class A {
    public readonly int m;
    A (int x) {
        m = x;
    }
}
```

- Values of readonly member can be set using constructor and modification is not possible later.

--- 

## Use of "base" keyword

1. To call base class constructor from derived class constructor
2. TO access hidden members of base class from derived class

**Example:**
```csharp
using System;
class Person {
    string name;
    int age;
    public Person(string name, int age) {
        this.name = name;
        this.age = age;
    }

    public void ShowInfo() {
        Console.WriteLine(name + " " + age);
    }
}

class Employee:Person {
    int salary;
    public Employee (string name, int age, int salary) : base(name, age) {
        this.salary = salary;
    }
    public void ShowSalary() {
        Console.WriteLine(salary);
    }

    public void ShowInfo() {        // Over writes the previous show info
        Console.WriteLine(name + " " + age + " " + salary);
    }

}

class Example {
    static void Main() {
        Employee e = new Employee("John", 25, 50000);
        e.ShowInfo();
        e.ShowSalary();
    }
}

```

---

# Method Overriding

- It is a feature of OOP using which the derived classes can have their own implemenation of the method which is already defined in the base class.
- In C#, the base class method must be "virtual" method so that it can be overriden and also derived class must use "override" keyword while method overriding.
- Method name and method signature must be same in both base and derived class.
- It is also called runtime polymorphism/ dynamic binding/ late binding.

**Example:**
```csharp
using System;
class Animal {
    public virtual void MakeSound() {
        Console.WriteLine("Animal is making sound");
    }
}

class Dog:Animal {
    public override void MakeSound() {
        Console.WriteLine("Dog Barking");
    }
}

class Main {
    static void Main() {
        Dog d = new Dog();
        d.MakeSound();
        Animal a = new Dog();
        a.MakeSound();
    }
}

```

---

## Use of "abstract" keyword

1. To create abstract method
2. To create abstract class

## Abstract Method
- It is a method which does not have body.
- Abstract methods are usually created in the base class. The derived classes create their own implementations of the abstract method.
- If a class contains one or more abstract methods, the class also must be abstract.

## Abstract Class
- A class which cannot be instantiated i.e. whose object cannot be created is called abstract class.
- An abstract class may contain both abstract mehod and concrete method.
- If a class is abstract, it is not compulsory to have abstract method.

**Example:**
```csharp
using System;
abstract class Animal {
    public abstract void MakeSound();
}

class Dog:Animal {
    public override void MakeSound() {
        Console.WriteLine("Dog Bhau Bhau");
    }
}

class Test {
    static void Main() {
        Dog d = new Dog();
        d.MakeSound();
    }
}
```

## Use of "sealed" keyword

1. To create sealed method
2. To create sealed class

## Sealed Method
- A method which cannot be further overridden is called sealed method.
- A method can be sealed by using the sealed keyword.
- A method can be sealed only if it is overridden in the derived class.
- A method can be sealed only if it is virtual or abstract in the base class.

**Example:**
```csharp
class A {
    public virtual void Show() {
        // Code here
    }
}
class B: A {
    public sealed void Show() {
        // Code here
    }
}

// Now, the derived classes of B cannot override Show()
```

## Sealed Class

- A class which cannot be derived/ inherited is called sealed class.
- A class can be sealed by using the sealed keyword.
- A class can be sealed only if it is not abstract.
- A class can be sealed only if it is not inherited from another class.

**Example:**
```csharp
sealed class A {
    // Code here
}
class B:A {     // Not allowed
    // Error: A is sealed and cannot be inherited
}
```