/*protected

Now we'll introduce protected, which is important when working with inheritance.

So far, we used fields like:

String name;
double salary;

These have default/package-private access because we didn't specify an access modifier.

Now we'll explicitly use:

protected
Problem Statement

Create an employee management system using single-level inheritance.

Parent Class — Employee

Create:

protected String employeeName;
protected double salary;

Method:

void displayEmployeeDetails()

It should display the employee name and base salary.

Child Class — Manager

Manager should extend Employee.

Add:

double bonus;

Create:

void calculateTotalSalary()

Inside this method:

Call the inherited displayEmployeeDetails() method.
Use the inherited salary.
Add the manager's bonus.
Display bonus.
Display total salary.
Formula
Total Salary = Base Salary + Bonus

Use:

Employee Name: Pranit
Salary: $80000
Bonus: $15000

Therefore:

Total Salary
= 80000 + 15000
= $95000
Expected Output
Employee Name: Pranit
Base Salary: $80000.0
Bonus: $15000.0
Total Salary: $95000.0 */

class Emp {

    protected String employeeName;
    protected double salary;

    void displayEmployeeDetails() {

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Base Salary: $" + salary);
    }
}


class Manager extends Emp {

    double bonus;

    void calculateTotalSalary() {

        displayEmployeeDetails();

        double totalSalary = salary + bonus;

        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + totalSalary);
    }
}


public class EmployeeManagers {

    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.employeeName = "Pranit";
        manager.salary = 80000;
        manager.bonus = 15000;

        manager.calculateTotalSalary();
    }
}