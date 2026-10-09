/*
In Problem 6, you learned:

super(name, age);

for calling a parent constructor.

Now we'll learn two more uses of super:

super.variable
super.method()

We'll use a simple example where the parent and child deliberately have a field with the same name so you can see the difference clearly.
Problem Statement — Employee → Developer

Create a parent class Employee.

Parent Class — Employee

Fields:

protected String role = "Employee";
protected String company;

Method:

void displayWork()

that prints:

Employee performs general company work.
Child Class — Developer

Developer extends Employee.

Create another field:

String role = "Software Developer";

and a method:

void displayDeveloperDetails()

Inside this method:

Display the child's role.
Display the parent's role using super.role.
Call the parent's displayWork() using super.displayWork().
Display a developer-specific message.
Expected Output
Child Role: Software Developer
Parent Role: Employee
Company: Microsoft
Employee performs general company work.
Developer writes and maintains software. */
class Staff{
     protected String role = "Employee";
     protected String company;

    void displayWork(){
        System.out.println("Employee performs general company work. ");
    }
}

class Deve extends Staff{
    String role = "Software Developer";

    void displayDeveloperDetails(){
        System.out.println("Child Role:" + role);
        System.out.println("Parent Role: " + super.role);
        System.err.println("Company: " + company);

        super.displayWork();
System.out.println("Developer writes and maintains software.");

    }
}

public class EmployeeDeveloperSuper {
 public static void main(String[] args) {
     Deve deve = new Deve();
     deve.company = "Microsoft";
     deve.displayDeveloperDetails();
 }
}
