package Basics;

abstract class Vehicle {

    // Abstract method - no body, MUST be overridden
    abstract void fuelType();

    // Regular method - has body, inherited as-is
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Carr extends Vehicle {
    @Override
    void fuelType() {
        System.out.println("Car uses Petrol");
    }
}

class ElectricBike extends Vehicle {
    @Override
    void fuelType() {
        System.out.println("Electric Bike uses Battery");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Vehicle v;

        v = new Carr();
        v.fuelType();  // Car uses Petrol
        v.start();     // Vehicle is starting...

        v = new ElectricBike();
        v.fuelType();  // Electric Bike uses Battery
    }
}
