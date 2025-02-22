// Check Vowel or consonant

using System;

class vowelCons {
    static void Main(string[] args) {
        Console.Write("Enter a character: ");
        char ch = Console.ReadKey().KeyChar;
        Console.WriteLine();
        ch = char.ToLower(ch);
        
        if (char.IsLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                Console.WriteLine(ch + " is a vowel.");
            } else {
                Console.WriteLine(ch + " is a consonant.");
            }
        } else {
            Console.WriteLine("Invalid input. Please enter a valid alphabetic character.");
        }
    }
}
