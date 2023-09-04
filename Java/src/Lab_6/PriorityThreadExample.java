package Lab_6;

class MaxPriorityThread extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.print(" i: " + i);
            Thread.yield(); // Optional: Give up the CPU briefly
        }
    }
}
class MinPriorityThread extends Thread {
    public void run() {
        for (int i = 100; i >= 51; i--) {
            System.out.print(" j: " + i);
            Thread.yield(); // Optional: Give up the CPU briefly
        }
    }
}


public class PriorityThreadExample {
    public static void main(String[] args) {
        MaxPriorityThread thread1 = new MaxPriorityThread();
        MinPriorityThread thread2 = new MinPriorityThread();

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

//        thread1.setName("Thread 1");
//        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}
