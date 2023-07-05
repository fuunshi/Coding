package Lab_2;

public class DivByFive {
    public static void main(String[] args) {
        System.out.println("The Number Divisible by 5 from 100 to 200 are:");
        for (int i = 100; i <= 200; i++){
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
