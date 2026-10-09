/*Problem 2:-Employee Salary System

This problem adds one new concept:

An abstract method can accept parameters just like a normal Java method.

Problem Statement

A company has different types of employees:

FullTimeEmployee
PartTimeEmployee

Every employee receives a salary, but the salary calculation is different.

Create an abstract class:

Employee

Inside it, create an abstract method:

abstract void calculateSalary(double amount);

Then create two child classes:

FullTimeEmployee
PartTimeEmployee

Both classes should extend Employee and implement calculateSalary() differently.

For this basic problem:

FullTimeEmployee → receives the complete monthly salary.
PartTimeEmployee → receives 50% of the given monthly salary.

For example, if the salary passed is:

5000

the expected output is:

Full-Time Employee Salary: $5000.0
Part-Time Employee Salary: $2500.0 */
abstract class Employee{
    @SuppressWarnings("unused")
    abstract void calculateSalary(double amount);
}

class FulltimeEmployee extends Employee{

    @Override 
    void calculateSalary(double amount){
        System.out.println("Full-Time Employee Salary: $" + amount);
    }
}

class PartTimeEmployee extends Employee{

    @Override 
    void calculateSalary(double amount){
        double salary = amount * 0.50;
        System.out.println("Part-Time Employee Salary: $" +salary);
    }
}
public class EmployeeSalarySystem {
    public static void main(String args[]){
        FulltimeEmployee fulltimeEmployee = new FulltimeEmployee();
        PartTimeEmployee partTime = new PartTimeEmployee();
        fulltimeEmployee.calculateSalary(5000);
        partTime.calculateSalary(5000);
    }
}
