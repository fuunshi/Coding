package Lab_8;

import java.io.*;

public class CollegeData {
    public static void main(String[] args) {
        try {
            // Input college names and student counts
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] colleges = new String[10];
            int[] studentCounts = new int[10];

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter the name of College " + (i + 1) + ": ");
                colleges[i] = reader.readLine();

                System.out.print("Enter the number of students for " + colleges[i] + ": ");
                studentCounts[i] = Integer.parseInt(reader.readLine());
            }

            // Write college data to a file using FileOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream("colleges.txt");
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));

            for (int i = 0; i < 10; i++) {
                writer.write(colleges[i] + "," + studentCounts[i]);
                writer.newLine();
            }

            writer.close();
            System.out.println("College data has been written to the file.");

            // Read from the file and display colleges with more than 500 students
            FileInputStream fileInputStream = new FileInputStream("colleges.txt");
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(fileInputStream));

            System.out.println("Colleges with more than 500 students:");
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] parts = line.split(",");
                String collegeName = parts[0];
                int students = Integer.parseInt(parts[1]);

                if (students > 500) {
                    System.out.println(collegeName);
                }
            }

            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
