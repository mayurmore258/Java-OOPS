package Basics;
// Compile time error will occur.
class Test {
    Test(int x, float y) {
        System.out.println("int float");
    }

    Test(float x, int y) {
        System.out.println("float int");
    }
}

public class Question {
    public static void main(String[] args) {
        Test obj = new Test(5, 5.0f);
    }
}
