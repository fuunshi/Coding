package Lab_4;

/*Create a class Person with firstName,lastName,age.
Create a parameterized constructor to initialize the
variables and a method void showInfo() to display
person details. Create a class Student which is  sub class
of Person and add the field  String faculty Override the method
showInfo() to display faculty.  Create a class Teacher which is a sub class
of Person and add  the field double salary.Override the method showInfo() to display salary.*/
class Person {
    private String firstName, lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private String faculty;

    public Student(String firstName, String lastName, int age, String faculty) {
        super(firstName, lastName, age);
        this.faculty = faculty;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Faculty: " + faculty);
    }
}

class Teacher extends Person {
    private double salary;

    public Teacher(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Salary: " + salary);
    }
}
public class School {
    public static void main(String[] args) {
        Student student = new Student("Ram", "Dhakal", 20, "Computer Science");
        Teacher teacher = new Teacher("Mentor", "Matt", 35, 5000.0);

        System.out.println("Student Details:");
        student.showInfo();

        System.out.println();

        System.out.println("Teacher Details:");
        teacher.showInfo();
    }
}
