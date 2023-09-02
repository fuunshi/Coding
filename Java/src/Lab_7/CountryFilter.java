package Lab_7;

import java.util.Scanner;

public class CountryFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] countries = new String[5];

        System.out.println("Enter the names of 5 countries:");

        for (int i = 0; i < countries.length; i++) {
            System.out.print("Country " + (i + 1) + ": ");
            countries[i] = scanner.nextLine();
        }

        System.out.println("Countries ending with a vowel:");
        for (String country : countries) {
            if (endsWithVowel(country)) {
                System.out.println(country);
            }
        }
    }

    public static boolean endsWithVowel(String str) {
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive check
        char lastChar = str.charAt(str.length() - 1);
        return lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u';
    }
}
