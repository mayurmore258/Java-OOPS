/*
Student Record Manager
 Create class Student
Requirements:
Variables: name, marks, age
Constructors:
Default → name = "Unknown", marks = 0, age = 0
        1 parameter → name only
2 parameters → name + marks
3 parameters → all
 Use constructor chaining (this())
Task:
Create different student objects
Print all details
*/
package Basics;

public class StudentRecordManager {
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student("Pratiksha More");
        Student S3 = new Student("Prakash More", 84.54);
        Student S4 = new Student("Mayur More", 90.34, 18);

        System.out.println("S1 name, S1 marks , S1 age: " + S1.name+", "+S1.marks+", "+S1.age);
        System.out.println("S2 name, S2 marks , S2 age: " + S2.name+", "+S2.marks+", "+S2.age);
        System.out.println("S3 name, S3 marks , S3 age: " + S3.name+", "+S3.marks+", "+S3.age);
        System.out.println("S4 name, S4 marks , S4 age: " + S4.name+", "+S4.marks+", "+S4.age);
    }
}
class Student{
    String name = "Unknown";
    double marks;
    int age;

    Student(){

    }
    Student(String name){
        this.name=name;
    }
    Student(String name, double marks){
        this.name=name;
        this.marks=marks;
    }
    Student(String name, double marks, int age){
        this.name=name;
        this.marks=marks;
        this.age=age;
    }
}