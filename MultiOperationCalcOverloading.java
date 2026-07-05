/*Multi-Operation Calculator
Create class Calculator
Overload method calculate():
        (int a, int b) → return addition
        (int a, int b, int c) → return multiplication
        (double a, double b) → return division
        (int a) → return square
Use proper return types
Task:
Call all methods and display results
*/
package Basics;

public class MultiOperationCalcOverloading {
    public static void main(String[] args) {

        Calculator C1 = new Calculator();
        int add = C1.calculate(2, 5);
        int square = C1.calculate(5);
        int multiplication = C1.calculate(2, 6, 2);
        double div = C1.calculate(2.0, 4.0);

        System.out.println("Addition="+add);
        System.out.println("Multiplication="+multiplication);
        System.out.println("Square="+square);
        System.out.println("Division="+div);
    }

}
class Calculator{
    int a,b,c;
    double x,y;
    int calculate(int a, int b){
        this.a=a;
        this.b=b;
        return a+b;
    }
    int calculate(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
        return a*b*c;
    }
    double calculate(double x, double y){
        this.x=x;
        this.y=y;
        return x/y;
    }
    int calculate(int a){
        this.a=a;
        return a*a;
    }
}
