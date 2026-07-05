package Basics;

class Personn{
    String name; int age;
    Personn(String name, int age){
        this.name = name;
        this.age = age;
    }
    Personn(){ }
    void displayDetails(){
        System.out.println("Details of Person:");
        System.out.println("Age: "+age+", Name: "+name);
    }
}

class Employee extends Personn{

    String empID;
    String empDepartment;
    Employee(String empID, String empDepartment){
        super.displayDetails();
        this.empID=empID;
        this.empDepartment=empDepartment;
    }
    void displayEmployeeDetails(){
        System.out.println("Details of Employee:");
        System.out.println("Employee ID: "+empID+", Employee Department: "+empDepartment);
    }
}
public class InheritanceQuestion2 {
    public static void main(String[] args){
        Personn p = new Personn("Mayur More", 18);
        Employee e = new Employee("P055555", "AI-DS" );
        p.displayDetails();
        System.out.println("\n\n\n");
        e.displayEmployeeDetails();
    }
}
