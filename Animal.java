package Basics;

public class Animal {
    void sound(){
        System.out.println("Some animal sound");
    }
}
class Lion extends Animal{
    void sound1(){
        super.sound();
        System.out.println("Roar");
    }

    public static void main(String[] args){
        Lion l = new Lion();
        l.sound1();

    }
}

