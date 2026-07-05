package Basics;

interface Moveable{
    void run();
}

interface Speakable{
    void speak();
}

interface Ability extends Moveable, Speakable{
    void show();
}

class Person implements Ability{
    public void run(){
        System.out.println("I can run");
    }
    public void speak(){
        System.out.println("I can speak");
    }
    public void show(){
        System.out.println("I can see");
    }
}

public class InterfaceQuestion {
    public static void main(String[] args) {

        Person p = new Person();

        p.show();
        p.run();
        p.speak();
    }
}
