package Lab_6;

class Factor20 extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (20 % i == 0) {
                System.out.println("Factor of 20 is: " + i);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Factor25 extends Thread {
    public void run() {
        for (int i = 1; i <= 25; i++) {
            if (25 % i == 0) {
                System.out.println("Factor of 25 is: " + i);
            }

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class DoubleInt {
    public static void main(String[] args) {
        Factor20 f20 = new Factor20();
        Factor25 f25 = new Factor25();

        f20.start();
        f25.start();
    }
}
