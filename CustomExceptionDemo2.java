package Basics;

class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}

class Voter{
    int age;
    Voter(int age){
        this.age = age;
    }
    void voterAge() throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("You are not adult you can't vote");
        }
        else{
            System.out.println("You can vote");
        }
    }
}

public class CustomExceptionDemo2 {
    public static void main(String[] args){

        Voter v = new Voter(20);
        try {
            v.voterAge();
        }
        catch(InvalidAgeException e){
            System.out.println("Something went wrong "+e.getMessage());
        }
    }
}
