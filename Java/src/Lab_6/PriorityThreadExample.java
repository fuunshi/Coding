package Lab_6;

class NumberThread extends Thread {
    private int start;
    private int end;

    public NumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i >= end; i--) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100); // Just to slow down the output for demonstration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PriorityThreadExample {
    public static void main(String[] args) {
        NumberThread thread1 = new NumberThread(50, 1);
        NumberThread thread2 = new NumberThread(100, 51);

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}
