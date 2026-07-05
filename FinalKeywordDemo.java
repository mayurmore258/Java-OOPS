package Basics;

import java.util.Scanner;

public class FinalKeywordDemo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        final int a = sc.nextInt();
        //a=100;    //error
        System.out.println(a);
    }
}

class Parent {
    final void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    //void show() { } // ❌ Error: cannot override
}

final class Apple { }

//class B extends Apple { } // ❌ Error: cannot extend
