package Basics;

class Student2{
    void greet(){
        System.out.println("Mayur");
    }
}

class Student1 {
    void greet() {
        System.out.println("Hello!");
    }

    void display() {
        this.greet();   // calls greet() of same class
        System.out.println("I am a student.");
    }

    public static void main(String[] args) {
        new Student1().display();
        // Output:
        // Hello!
        // I am a student.
    }
}