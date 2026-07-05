package Basics;

class Demo {

    // Static variable (shared by all objects)
    static int staticVar = 100;

    // Non-static variable (separate for each object)
    int nonStaticVar = 50;

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method");

        // Can access static variable directly
        System.out.println("Static Variable: " + staticVar);

        // Cannot access non-static variable directly
        // System.out.println(nonStaticVar); ❌ ERROR
    }

    // Non-static method
    void nonStaticMethod() {
        System.out.println("This is a non-static method");

        // Can access both static and non-static
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Non-Static Variable: " + nonStaticVar);
    }
}

public class StaticConcept {
    public static void main(String[] args) {

        // Calling static method (no object needed)
        Demo.staticMethod();

        System.out.println();

        // Creating objects
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        // Calling non-static methods
        obj1.nonStaticMethod();

        System.out.println();

        // Changing values
        obj1.nonStaticVar = 200;
        obj2.nonStaticVar = 300;

        // Static variable change (shared)
        Demo.staticVar = 999;

        System.out.println("After changes:");

        System.out.println("obj1 non-static: " + obj1.nonStaticVar);
        System.out.println("obj2 non-static: " + obj2.nonStaticVar);

        System.out.println("Static variable (shared): " + Demo.staticVar);
    }
}
