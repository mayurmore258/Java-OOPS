package Basics;

interface Printable {
    void print();  // abstract by default
}

interface Scannable {
    void scan();
}

// A class can implement multiple interfaces
class Printer implements Printable, Scannable {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}
class ThreeDimensionalPrinter implements Printable, Scannable{
    public void print() {
        System.out.println("Printing Object...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning Object...");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        ThreeDimensionalPrinter tp = new ThreeDimensionalPrinter();
        tp.print();
        tp.scan();
        Printer p = new Printer();
        p.print();
        p.scan();

    }
}
