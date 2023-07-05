package Lab_4;

import java.util.Scanner;

class Student_r {
    protected int roll_no;

    public void readRollNo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        roll_no = scanner.nextInt();
    }

    public void displayRollNo() {
        System.out.println("Roll number: " + roll_no);
    }
}

class Test extends Student_r {
    protected int English;
    protected int Nepali;

    public void readMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for English: ");
        English = scanner.nextInt();
        System.out.print("Enter marks for Nepali: ");
        Nepali = scanner.nextInt();
    }

    public void displayMarks() {
        System.out.println("Marks for English: " + English);
        System.out.println("Marks for Nepali: " + Nepali);
    }
}

class Result extends Test {
    private int total;

    public void calculateTotal() {
        total = English + Nepali;
    }

    public void displayTotal() {
        System.out.println("Total marks: " + total);
    }
}

public class Exam {
    public static void main(String[] args) {
        Result result = new Result();
        result.readRollNo();
        result.readMarks();
        result.calculateTotal();

        System.out.println("\nStudent Details:");
        result.displayRollNo();
        result.displayMarks();
        result.displayTotal();
    }
}
