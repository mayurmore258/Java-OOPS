/*
Create a class Box
Requirements:
Instance variables: length, breadth, height
Use constructor overloading:
        1 parameter → cube
2 parameters → height = 1
        3 parameters → full box
Use this keyword for assignment
Task:
Create 3 objects (cube, rectangle box, full box)
Print volume of each
*/
package Basics;

public class SmartBoxQuestionOverloading {
    public static void main(String[] args){
        Box cube = new Box(5);
        Box rectangleBox = new Box(5,6);
        Box box = new Box(5,4,3);
    }
}
class Box{
    int s,l,b,h,v;

    Box(int s){
        this.s=s;
        this.v=s*s*s;
        System.out.println("The volume of cube is "+this.v);
    }
    Box(int l,int b, int h){
        this.l=l;
        this.b=b;
        this.h=h;
        this.v=l*b*h;
        System.out.println("The volume of box is "+this.v);
    }Box(int l,int b){
        this.l=l;
        this.b=b;
        this.v=l*b;
        System.out.println("The volume of Rectangular box is "+this.v);
    }
}
