package Lab_2;

public class PalindromeHun {
    public static void main(String[] args) {
        for (int i = 100; i != 501; i++) {
            if (i == reverse(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}
