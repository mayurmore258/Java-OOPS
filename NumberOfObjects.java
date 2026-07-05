package Basics;

public class NumberOfObjects {
    static void main(String[] z) {
        Objectss o1 = new Objectss();
        Objectss o2 = new Objectss();
        Objectss o3 = new Objectss();

        System.out.println(Objectss.count);
    }
}

class Objectss{
    static int count=0;
    Objectss(){
        count++;
    }
}
