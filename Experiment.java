package Basics;

public class Experiment {
    public static void main(String[] args){
        A banana = new A();
        banana.b();
        B apple = new B();
        apple.b();
    }
}
class A{
    void b(){
        System.out.println("mayur");
    }
}
class B extends A{
    void b(){
        System.out.println("more");
    }

}
