package Lab_4;

import java.util.Scanner;

class Student_y {
    private String name, faculty;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class YoungestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student_y[] students = new Student_y[3];

        // Input student details
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            Student_y student = new Student_y();

            System.out.print("Name: ");
            student.setName(scanner.nextLine());

            System.out.print("Age: ");
            student.setAge(scanner.nextInt());
            scanner.nextLine(); // Consume the newline character

            System.out.print("Faculty: ");
            student.setFaculty(scanner.nextLine());

            students[i] = student;
        }

        // Find the youngest student
        Student_y young = students[0];
        for (int i = 1; i < 3; i++) {
            if (students[i].getAge() < young.getAge()) {
                young = students[i];
            }
        }

        // Display details of the youngest student
        System.out.println("Details of the youngest student:");
        System.out.println("Name: " + young.getName());
        System.out.println("Age: " + young.getAge());
        System.out.println("Faculty: " + young.getFaculty());
    }
}
