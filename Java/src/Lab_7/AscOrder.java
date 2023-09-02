package Lab_7;

import java.util.Scanner;

public class AscOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cities = new String[5];

        System.out.println("Enter the names of 5 cities:");

        for (int i = 0; i < cities.length; i++) {
            System.out.print("City " + (i + 1) + ": ");
            cities[i] = scanner.nextLine();
        }

        // Manual bubble sort
        for (int i = 0; i < cities.length - 1; i++) {
            for (int j = 0; j < cities.length - i - 1; j++) {
                if (cities[j].compareTo(cities[j + 1]) > 0) {
                    // Swap the elements
                    String temp = cities[j];
                    cities[j] = cities[j + 1];
                    cities[j + 1] = temp;
                }
            }
        }

        System.out.println("Cities in alphabetical order:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
