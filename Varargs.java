package Basics;

class Demoo {
    void show(int a) {
        System.out.println("Normal method");
    }

    void show(int... a) {
        System.out.println("Varargs method");
    }
}
public class Varargs {
    public static void main(String[] args) {
        Demoo d = new Demoo();
        d.show(3,8,9,7);
    }
}
