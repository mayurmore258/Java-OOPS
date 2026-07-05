package Basics;

public class AccessModifierDemo {
    private int a = 1;
    int b = 2;
    protected int c = 3;
    public int d = 4;

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args){
        AccessModifierDemo d = new AccessModifierDemo();
        d.display();
    }
}

