/*
Payment System
Class Payment
method pay(
Overload:
pay(int amount)
pay(int amount, String coupon)
Subclasses:
UPI, Card, Cash
Override pay() differently
*/

package Basics;

import java.util.Scanner;

public class PaymentSystem {
    static void main() {

        Scanner sc = new Scanner(System.in);
        double amount;
        String coupon;

        System.out.println("==========MENU==========");
        System.out.println("1. Card\n2. UPI");
        System.out.print("Enter your choice number: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        amount = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Coupon (NONE if not available): ");
        coupon = sc.nextLine();

        switch(choice){
            case 1:
                Card c = new Card();
                c.pay(amount, coupon);
                break;

            case 2:
                UPI u = new UPI();
                u.pay(amount, coupon);
                break;

            default:
                System.out.println("Invalid Choice!");
        }
    }
}

class Payment {
    void pay(double a){
        System.out.println(a + " Rupees paid!!");
    }

    void pay(double a, String coupon){
        double discount = 0;

        if(coupon.equals("SAVE10")){
            discount = a * 0.10;
        }
        else if(coupon.equals("SAVE30")){
            discount = a * 0.30;
        }
        else if(coupon.equals("NONE")){
            discount = 0;
        }
        else{
            System.out.println("Invalid Coupon!!");
            return;
        }

        double finalAmount = a - discount;
        System.out.println("Final Amount Paid: " + finalAmount + " Rupees");
    }
}

class UPI extends Payment {
    @Override
    void pay(double a){
        System.out.println(a + " Rupees paid via UPI!!");
    }

    @Override
    void pay(double a, String coupon){
        super.pay(a, coupon);
        System.out.println("Payment done via UPI");
    }
}

class Card extends Payment {
    @Override
    void pay(double a){
        System.out.println(a + " Rupees paid via Card!!");
    }

    @Override
    void pay(double a, String coupon){
        super.pay(a, coupon);
        System.out.println("Payment done via Card");
    }
}