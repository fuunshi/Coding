package Lab_4;

/*Create a class Employee with the instance variables name, age, salary.
Create getters and setters. Create a test class and create an object of
Employee class, then set and print the employee details.*/

class Employee {
    private String name;
    private int age, salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class GetSetExample {
    public static void main(String[] args) {
        Employee me = new Employee();
        me.setName("Pranil Shrestha");
        me.setAge(20);
        me.setSalary(20000);
        System.out.println("Name: " + me.getName());
        System.out.println("Age: " + me.getAge());
        System.out.println("Salary: " + me.getSalary());
    }
}
