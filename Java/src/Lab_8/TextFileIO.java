package Lab_8;

import java.io.*;

public class TextFileIO {
    public static void main(String[] args) {
        try {
            // Input from the console
            System.out.print("Enter a line of text: ");
            InputStreamReader reader = new InputStreamReader(System.in);
            StringBuilder inputLine = new StringBuilder();
            int data;

            while ((data = reader.read()) != -1 && data != '\n' && data != '\r') {
                inputLine.append((char) data);
            }

            // Write to a file using FileOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream("textfile.txt");
            byte[] bytes = inputLine.toString().getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            System.out.println("Text has been written to the file.");

            // Read from the file using FileInputStream
            FileInputStream fileInputStream = new FileInputStream("textfile.txt");
            System.out.println("Contents of the file:");
            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
