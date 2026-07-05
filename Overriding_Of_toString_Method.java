package Basics;
//overriding by toString() method
public class Overriding_Of_toString_Method {
    static void main(String[] args) {
        Studentss s = new Studentss();
        s.name="Mayur";
        s.age=18;
        s.marks=85;
        System.out.println(s.toString());

    }
}

class Studentss{
    String name;
    int marks;
    int age;
/*
public is mandatory to override toString();
because in java by default the method is public
*/
    public String toString(){
        return name+" "+marks+" "+age;
    }
}
