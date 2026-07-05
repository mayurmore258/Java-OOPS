package Basics;

public class ScientificCalculator {
    public static void main(String[] args){
        SciCalc sc = new SciCalc();

        sc.calc(2,3);
        sc.calc(3,4,5);

    }
}

class NormalCalc{
    void calc(double a,double b){
        System.out.println("Sum="+(a+b));
    }
    void calc(double a,double b,double c){
        System.out.println("Sum="+(a+b+c));
    }
}

class SciCalc extends NormalCalc{
    void calc(double a, double b){
        System.out.println(a+" to the power "+b+"="+(Math.pow(a,b)));
    }
}
