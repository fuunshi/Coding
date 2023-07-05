package Lab_2;

public class PrimeHunToHun {
    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++)
        {
            if (i % 10 == 0 || i % 10 == 1)
                System.out.print(i + " ");
        }
    }
}
