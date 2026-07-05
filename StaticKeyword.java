package Basics;

public class StaticKeyword {
    public static void main(String[] args){
        Human h = new Human("Mayur", 18);
        Human h1=new Human("anjkasdh", 13);
    }
}

class Human{
    String name;
    int age;
    static int population;

    Human(String name, int age){
        this.name=name;
        this.age=age;
        Human.population++;

        System.out.println(name+" "+age+" "+" "+Human.population);
    }
}
