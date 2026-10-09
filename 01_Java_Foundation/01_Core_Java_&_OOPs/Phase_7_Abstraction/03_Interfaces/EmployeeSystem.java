/*Problem 4: Employee Salary System

Now we'll introduce an interface method that returns a value.

Problem Statement

Create an employee salary system.

Requirements:

Create an interface Employee.
Declare double calculateSalary().
Create FullTimeEmployee.
Create PartTimeEmployee.
Both classes implement Employee.
Full-time salary is based on a fixed monthly salary.
Part-time salary is calculated using hoursWorked × hourlyRate.
Use interface references in main(). */
interface Employee{
    double calculateSalary();
}

class FullTimeEmployee implements Employee{
    double monthlySalary = 5000;

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}

class PartTimeEmployee implements Employee{
    double hoursWorked = 80;
    double hourlyRate = 25;

    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
}
public class EmployeeSystem {
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee();
        Employee employee2 = new PartTimeEmployee();

        double fullTimeSalary = employee1.calculateSalary();
        double partTimeSalary = employee2.calculateSalary();
        System.out.println("Full-Time Employee Salary: $" + fullTimeSalary);
        System.out.println("Part-Time Employee Salary: $" + partTimeSalary);
    }
}
