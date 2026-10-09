/*Employee Salary Management System

This problem will go one step beyond Problem 1. We will use encapsulation not just to hide fields, but to enforce company salary rules.

We are still not using constructors.

Problem Statement

A company needs an employee management system.

Create a class:

Employee

Each employee should have:

employeeId
employeeName
department
salary

The company has the following rules:

All fields must be private.
Employee ID can be assigned once but cannot be changed afterward.
Employee name can be viewed and changed.
Department can be viewed and changed.
Salary can be viewed but should not have a normal setter.
Initial salary must be greater than 0.
Salary increases should happen through a method called increaseSalary().
The percentage increase must be greater than 0 and cannot exceed 20%.
Display appropriate messages when an operation is rejected. */
public class EmployeeSalary {
    private int employeeID;
    private String employeeName;
    private String department;
    private double salary;

    public void setEmployeeID(int employeeID){
        if(this.employeeID == 0 && employeeID > 0){
            this.employeeID = employeeID;
        }else{
            System.out.println("Employee ID cannot be changed");
        }
    }

    public int getEmployeeId(){
        return employeeID;
    }

    public void setEmployeeName(String employeeName){
        if(employeeName != null && !employeeName.isEmpty()){
            this.employeeName = employeeName;
        }else{
            System.out.println("Invalid employee Name");
        }
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public void setDepartment(String department){
        if(department != null && !department.isEmpty()){
            this.department = department;
        }else{
            System.out.println("Invalid Department");
        }
    }

    public String getDepartment(){
        return department;
    }

    public void setInitialSalary(double salary){
        if(this.salary == 0 && salary > 0){
            this.salary = salary;
        }else{
            System.out.println("Invalid salary or salary already assigned");
        }
    }

    public double getSalary(){
        return salary;
    }

    public void increaseSalary(double percentage){
        if(percentage <= 0){
            System.out.println("Percentage must be greater than 0");
        }else if(percentage > 20){
            System.out.println("Salary increase cannot exceed 20%");
        }else{
            double increaseAmount = this.salary * percentage / 100;
            this.salary = this.salary + increaseAmount;
            System.out.println("Salary increased successfully");
            System.out.println("Increase Amount: $ + increaseAmount");
        }
    }

    public static void main(String args[]){
        EmployeeSalary employee = new EmployeeSalary();

        employee.setEmployeeID(101);
        employee.setEmployeeName("Pranit Mhatre");
        employee.setDepartment("Software Engineering");
        employee.setInitialSalary(90000);

        System.out.println("Before Salary Increase");
        System.out.println("Salary: $" + employee.getSalary());

        employee.increaseSalary(10);

        System.out.println();
        System.out.println("Employee Details");
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Salary: $" + employee.getSalary());
    }
    
}
