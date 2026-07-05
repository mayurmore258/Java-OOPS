package Basics;

import java.util.ArrayList;
import java.util.Vector;

public class VectorArrayListDemo {
    public static void main(String[] args) {
        // ArrayList Example
        ArrayList<Object> list = new ArrayList<Object>();
        list.add("Java");
        list.add("Python");
        list.add(2,"Mayur");
        int a=list.lastIndexOf(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list);

        // Vector Example
        Vector<Object> vec = new Vector<Object>();
        vec.add(10);
        vec.add(20);
        vec.add("Mayur");
        System.out.println(vec);
        System.out.println(vec.size()); // Prints: 2
    }
}
