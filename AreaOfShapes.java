package Basics;
// This is concept of abject overloading in java
public class AreaOfShapes {
    public static void main(String[] args){
        Area Square= new Area(3);
        Perimeter Rectangle = new Perimeter(9,10);
        System.out.println("Area of Square is "+Square.a);
        System.out.println("Perimeter of Rectangle is "+Rectangle.a);
    }
}
class Area{
    int a;
    Area(int s){
        a=s*s;
    }
    Area(int l, int b){
        a=l*b;
    }
}
class Perimeter{
    int a;
    Perimeter(int s)
    {
        a = 4*s;
    }
    Perimeter(int l, int b)
    {
        a = (l+l+b+b);
    }
}
