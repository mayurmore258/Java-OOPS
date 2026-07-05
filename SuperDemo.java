package Basics;

class X{
    int n;
    X(int n){
        this.n = n;
        System.out.println("I am in X int");
    }
}
class Y extends X{

    Y() {
        super(10);
        System.out.println("I am in Y");
    }
}

public class SuperDemo {
    public static void main(String[] args){
        Y y = new Y();

    }
}
