package Basics;

import java.util.*;

class Students{
    int rn;
    String name;
    int Marks;
}
public class CreateClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Students:");
        int n = sc.nextInt();
        sc.nextLine();

        Students[] s = new Students[n];

        System.out.println("Enter details of Students");

        for(int i=0; i<n; i++){
            s[i] = new Students();

            System.out.println("Enter details of student "+i);
            System.out.println("Enter name: ");
            s[i].name = sc.nextLine();

            System.out.println("Enter roll number: ");
            s[i].rn = sc.nextInt();

            System.out.println("Enter marks");
            s[i].Marks = sc.nextInt();
        }
        System.out.println(" ");

        System.out.println("Details of students are: ");
        System.out.println("Name\t\tRoll No.\tMarks");
        for(int i=0; i<n; i++){
            sc.nextLine();
            System.out.println(s[i].name+"\t\t"+s[i].rn+"\t\t"+s[i].Marks);
        }
    }
}
