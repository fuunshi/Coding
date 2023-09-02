package Lab_2;

public class PrimeHunToHun {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
