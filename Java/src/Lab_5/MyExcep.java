package Lab_5;

import java.util.Scanner;
class MyException extends Exception {
    MyException(String msg){
        super(msg);
    }
}
public class MyExcep {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter two numbers");
        double a=ob.nextDouble();
        double b=ob.nextDouble();
        double c=a/b;
        if(c<0.0001){
            try{
                MyException me=new MyException("Result is too small");
                throw me;
            }catch(MyException ex){
                System.out.println(ex);
            }
        }
        else{
            System.out.println("Result is : "+c);
        }
    }
}