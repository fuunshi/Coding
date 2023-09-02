package Lab_6;

class BirdThread implements Runnable {
    @Override
    public void run() {
        String[] birds = {"Sparrow", "Robin", "Eagle", "Hummingbird", "Penguin"};

        for (String bird : birds) {
            System.out.println("Bird: " + bird);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class AnimalThread implements Runnable {
    @Override
    public void run() {
        String[] animals = {"Lion", "Elephant", "Giraffe", "Tiger", "Kangaroo"};

        for (String animal : animals) {
            System.out.println("Animal: " + animal);

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BirdAnimal {
    public static void main(String[] args) {
        Thread birdThread = new Thread(new BirdThread());
        Thread animalThread = new Thread(new AnimalThread());

        birdThread.start();
        animalThread.start();
    }
}