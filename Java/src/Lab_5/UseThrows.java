package Lab_5;

import java.util.Scanner;
class MyException2 extends Exception {
    MyException2(String msg){
        super(msg);
    }
}
class Test {
    public void divide(double a,double b) throws MyException2{
        double c=a/b;
        if(c<0.0001){
            MyException2 me=new MyException2("Result is too small");
            throw me;
        }
        else {
            System.out.println("Result is: "+c);
        }
    }
}
public class UseThrows {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter two numbers");
        double a=ob.nextDouble();
        double b=ob.nextDouble();
        Test t=new Test();
        try{
            t.divide(a, b);
        }catch(MyException2 ex){
            System.out.println(ex);
        }
    }
}
