/*Employee → Developer
Concept

Practice the simplest form of single-level inheritance:

Employee
   ↑
Developer

A Developer IS-A Employee.

Problem Statement

Create a Java program with:

Parent class — Employee

String name
int employeeId
Method displayEmployee()

Child class — Developer

Inherits Employee
String programmingLanguage
Method displayDeveloperSkill()

In main():

Create a Developer object.
Assign employee name, ID, and programming language.
Call both the inherited parent method and the child's own method.
Expected Output
Employee Name: Pranit
Employee ID: 101
Programming Language: Java */
class Employee{
    String name;
    int employeeID;

    void displayEmployee(){
        System.out.println("Employee Name:" + name);
        System.out.println("Employee ID:" + employeeID);
    }
}

class Developer extends Employee{
    String programmingLanguage;
    void displayDeveloperSkill(){
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
public class EmployeeDeveloper {
  public static void main(String args[]){
    Developer developer = new Developer();

    developer.employeeID = 101;
    developer.name = "Pranit";
    developer.programmingLanguage = "Java";

    developer.displayEmployee();
    developer.displayDeveloperSkill();
  }  
}
