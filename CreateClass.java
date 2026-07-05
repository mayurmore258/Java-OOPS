package Basics;

import java.util.Scanner;

class Car{
    double speed;
    int price;
    String Name;
}

public class CreateClass {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of cars: ");
        int n = sc.nextInt();

        sc.nextLine();
        // MISTAKE : nextLine() was missing after nextInt().
        // Without this, the first car name would be skipped.

        Car[] car = new Car[n];
        System.out.println("Enter details of cars: ");

        for(int i=0; i<n; i++){

            car[i] = new Car();

            System.out.println("Enter details of Car "+(i+1));

            System.out.print("Enter name: ");
            car[i].Name = sc.nextLine();

            System.out.print("Enter price: ");
            car[i].price = sc.nextInt();

            System.out.print("Enter speed: ");
            car[i].speed = sc.nextDouble();
            sc.nextLine();

        }

        System.out.println("Car details are:");

        for(int i=0; i<n; i++){

            System.out.println("Details of Car "+(i+1));

            System.out.println("Car "+i+":\t"+car[i].Name+"\t"+car[i].price+"\t"+car[i].speed);
        }
    }
}