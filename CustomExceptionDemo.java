package Basics;

import java.util.*;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(){
        super("Something went wrong");
    }
    InsufficientBalanceException(String message){
        super(message);
    }
}

class Bank{
    int balance;
    int amt;
    Bank(int balance, int amt){
        this.amt = amt;
        this.balance=balance;
    }

    void withdraw() throws InsufficientBalanceException{
        if(balance<amt){
            throw new InsufficientBalanceException("Insufficient bank balance!!");
        }
        else{
            System.out.println("Withdraw Successful :)"+amt);
            System.out.println("Balance: "+(balance-amt));
        }
    }
}
public class CustomExceptionDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to withdraw");
        int amt=sc.nextInt();

        Bank b = new Bank(1000, amt);
        try{
            b.withdraw();
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
