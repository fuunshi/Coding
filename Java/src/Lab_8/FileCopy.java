package Lab_8;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFileName = "university.txt";
        String destinationFileName = "college.txt";

        try {
            FileInputStream inputStream = new FileInputStream(sourceFileName);
            FileOutputStream outputStream = new FileOutputStream(destinationFileName);

            int bytesRead;
            byte[] buffer = new byte[1024];

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("Content copied from " + sourceFileName + " to " + destinationFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
