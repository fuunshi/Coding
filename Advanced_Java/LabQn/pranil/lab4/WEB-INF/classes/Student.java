public class Student {
  private String name;
  private String faculty;
  private int age;

  // Constructor
  public Student(String name, String faculty, int age) {
    this.name = name;
    this.faculty = faculty;
    this.age = age;
  }

  // Getters and Setters
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
