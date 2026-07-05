package Basics;

public class JavaInterfaceDemo {
    public static void main(String[] args) {
        FullName n = new FullName("Mayur", "More");
        n.yourName();
        n.yourSurname();
    }
}
interface Name{
    public void yourName();
}
interface Surname{
    public void yourSurname();
}
class FullName implements Name, Surname{
    String name, surname;
    FullName(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void yourName(){
        System.out.println("Your name is "+name);
    }
    public void yourSurname(){
        System.out.println("Your name is "+surname);
    }
}