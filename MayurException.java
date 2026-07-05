package Basics;

import java.util.*;

public class MayurException extends Exception {
    MayurException(String Message)
    {
        super(Message);
    }
}

class Mayur{
    Scanner sc = new Scanner(System.in);
    String s;
    void setName(){
        System.out.println("Enter your name");
        s = sc.nextLine();
    }
    void getName() throws MayurException{
        if(s.equals("Mayur") || s.equals("mayur") ||s.equals("MAYUR")){
            System.out.println("Name is "+s);
        }
        else{
            throw new MayurException("Ur not Mayur so get out");
        }
    }
}

class MayurExceptionTest{
     public static void main(String[] args){

        Mayur m = new Mayur();
        m.setName();
        try{
            m.getName();
        } catch(MayurException e){
            System.out.println(e.getMessage());
        }

    }
}
