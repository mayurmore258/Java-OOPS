package Basics;

import java.util.*;

class InsufficientBankBalanceException extends Exception{
    InsufficientBankBalanceException(String message){
        super(message);
    }
    InsufficientBankBalanceException(){
        super("Gareeb!!");
    }
}

class MayurBank{
    int balance;
    MayurBank(int balance){
        this.balance=balance;
    }
    void withdrawAmount(int amt) throws InsufficientBankBalanceException{
        if(balance<amt){
            throw new InsufficientBankBalanceException("Saale tu gareeb hai itne paise nahi hai tere account mein");
        }
        else{
            balance = balance-amt;
            System.out.println("Withdraw Successful!");
            System.out.println("Balance="+balance);
        }
    }
}

public class TTExceptionQues2 {
    public static void main(String[] args){
        MayurBank mb = new MayurBank(170);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int amt = sc.nextInt();

        try{
            mb.withdrawAmount(amt);
        } catch(InsufficientBankBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
