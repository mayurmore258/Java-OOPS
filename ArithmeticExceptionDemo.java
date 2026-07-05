package Basics;

public class ArithmeticExceptionDemo {
    public static void main(String[] args){
        int a=10, b=2;
        int c=0;
        try{
            c=a/b;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
