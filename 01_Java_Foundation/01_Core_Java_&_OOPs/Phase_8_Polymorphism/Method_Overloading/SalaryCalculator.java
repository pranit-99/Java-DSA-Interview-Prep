/*Employee Salary Calculator

So far, our overloaded methods have mostly been void. Now we'll learn that:

Overloaded methods can also return values.

This problem also reinforces overloading using a different number of parameters.

Problem Statement

A company has a salary calculator.

Employees may receive:

Only a base salary
Base salary + bonus
Base salary + bonus + overtime payment

Create three overloaded methods: */
public class SalaryCalculator {
    public double calculateSalary(double baseSalary){
        return baseSalary;
    }

    public double calculateSalary(double baseSalary, double bonus){
        return baseSalary + bonus;
    }

    public double calculateSalary(double baseSalary, double bonus, double overtime){
        return baseSalary + bonus + overtime;
    }

    public static void main(String args[]){
        SalaryCalculator salary = new SalaryCalculator();

        double result1 = salary.calculateSalary(5000);
        System.out.println("Salary 1: $" + result1);
        System.out.println("--------------------------");

        double result2 = salary.calculateSalary(500,1000);
        System.out.println("Salary 2: $" + result2);

        System.out.println("--------------------------");


        double result3 =
                salary.calculateSalary(5000, 1000, 500);

        System.out.println("Salary 3: $" + result3);


    }
}
