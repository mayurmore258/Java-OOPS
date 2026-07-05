package Basics;

class ClassRoom{
    private int marks;

    void setMarks(int m) {
        marks = m;
    }

    int getMarks() {
        return marks;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args){
        ClassRoom c = new ClassRoom();
        c.setMarks(25);
        System.out.println(c.getMarks());
    }
}
