package Lab_8;

import java.io.*;

class Student implements Serializable{
    private String name;
    private String faculty;
    private int age;

    public Student(String name, String faculty, int age) {
        this.name = name;
        this.faculty = faculty;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [Name: " + name + ", Faculty: " + faculty + ", Age: " + age + "]";
    }
}

public class ObjectStreamExample {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John", "Engineering", 20);

        // Serialize the Student object and save it to a file
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("student.obj"))) {
            outputStream.writeObject(student);
            System.out.println("Student object has been serialized and saved to 'student.obj'");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize and display the contents of the saved object
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("student.obj"))) {
            Student savedStudent = (Student) inputStream.readObject();
            System.out.println("Deserialized Student object: " + savedStudent);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
