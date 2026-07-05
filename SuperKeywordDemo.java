package Basics;

public class SuperKeywordDemo {
    public static void main(String[] args){
        Dog d = new Dog();
        d.display();
        Cat c = new Cat();
        c.display();
    }
}
class Animals{
    String name = "Animal";

}
class Dog extends Animals{
    String name = "Dog";
    void display(){
        System.out.println("I am in Dog class"+super.name);
        System.out.println("I am in Dog class"+name);
    }
}
class Cat extends Dog{
    String name = "cat";
    void display(){
        System.out.println("I am in Cat class "+super.name);
        System.out.println("I am in Cat class "+name);
    }
}