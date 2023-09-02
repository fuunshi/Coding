package Lab_7;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        StringBuffer reversed = reverseStringBuffer(word);

        System.out.println("Reversed word: " + reversed);

        if (isPalindrome(word)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }

    public static StringBuffer reverseStringBuffer(String str) {
        return new StringBuffer(str).reverse();
    }

    public static boolean isPalindrome(String str) {
        String reversed = reverseStringBuffer(str).toString();
        return str.equalsIgnoreCase(reversed);
    }
}
