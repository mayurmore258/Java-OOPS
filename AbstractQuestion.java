package Basics;

abstract class Shape{
    abstract void calculateArea(double r);
    abstract void calculatePerimeter(double r);
}

class Circle extends Shape{
    void calculateArea(double r){
        double a = 3.14*r*r;
        System.out.println("Area of circle is "+a);
    }
    void calculatePerimeter(double r){
        double a = 2*3.14*r;
        System.out.println("Perimeter of circle is "+a);
    }
}

class Square extends Shape{
    void calculateArea(double r){
        double a = r*r;
        System.out.println("Area of square is "+a);
    }
    void calculatePerimeter(double r){
        double a = 4*r;
        System.out.println("Perimeter of square is "+a);
    }
}

public class AbstractQuestion {
    public static void main(String[] args){
        Square s = new Square();
        Circle c = new Circle();

        s.calculateArea(2);
        s.calculatePerimeter(2);
        c.calculateArea(2);
        c.calculatePerimeter(2);
    }
}
