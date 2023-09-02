package Lab_6;

class DisplayNumber extends Thread {
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("i: " + i);
            try{
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class NumInt{
    public static void main(String []args){
        DisplayNumber interval = new DisplayNumber();
        interval.start();
    }
}