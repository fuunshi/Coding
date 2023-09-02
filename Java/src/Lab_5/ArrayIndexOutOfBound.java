package Lab_5;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        try{
            arr[7] = 20;
            System.out.println("Success!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundException.\nThe Position user is trying to access doesn't Exist.");
        }
    }
}
