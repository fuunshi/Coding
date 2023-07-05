package Lab_2;

public class DisplayPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j != i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_________________");
        int a = 7;
        for (int i = 4; i > 0; i--)
        {
            for (int j = 4; j != i; j--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j != a; j++)
            {
                System.out.print("*");
            }
            a -= 2;
            System.out.println();
        }
        System.out.println("_________________");
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i + 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
