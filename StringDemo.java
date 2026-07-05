package Basics;

import java.util.*;

public class StringDemo {
    public static void main(String[] args){
        String s = "Mayur";
        int a=s.length();
        System.out.println(a);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.concat(" More"));
        System.out.println(s.length());

        System.out.println("");
        System.out.println("Stringbuffer");
        System.out.println("");

        StringBuffer sb = new StringBuffer("Mayur");
        System.out.println(sb.length());
        System.out.println(sb);
        sb.append(" Mayur");
        System.out.println(sb);
        System.out.println(sb.length());



        String b = new String("Mayur");
        String s1=b.concat(" More");
        System.out.println(b.length());
        System.out.println(s1.length());
    }
}
