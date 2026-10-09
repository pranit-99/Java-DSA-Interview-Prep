/*Employee Bonus Calculation System

Now we'll practice overriding with different business calculations.

The important point remains:

Parent and child have the same method signature, but each child provides different logic.

Problem Statement

A company calculates employee bonuses differently depending on the employee role.

Employee
   |
   ├── Developer
   ├── Manager
   └── SalesEmployee

The parent class contains:

calculateBonus(double salary)

The bonus rules are:

Developer      → 10% of salary
Manager        → 20% of salary
SalesEmployee  → 15% of salary

For:

Salary = $80,000

we expect:

Developer      → $8,000
Manager        → $16,000
SalesEmployee  → $12,000*/
class Employee {

    public double calculateBonus(double salary) {
        return 0;
    }
}


class Developer extends Employee {

    @Override
    public double calculateBonus(double salary) {
        double bonus = salary * 0.10;
        return bonus;
    }
}


class Manager extends Employee {

    @Override
    public double calculateBonus(double salary) {
        double bonus = salary * 0.20;
        return bonus;
    }
}


class SalesEmployee extends Employee {

    @Override
    public double calculateBonus(double salary) {
        double bonus = salary * 0.15;
        return bonus;
    }
}


public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee1 = new Developer();
        Employee employee2 = new Manager();
        Employee employee3 = new SalesEmployee();


        double developerBonus = employee1.calculateBonus(80000);

        double managerBonus = employee2.calculateBonus(80000);

        double salesBonus = employee3.calculateBonus(80000);


        System.out.println("Developer Bonus: $" + developerBonus);

        System.out.println("Manager Bonus: $" + managerBonus);

        System.out.println("Sales Employee Bonus: $" + salesBonus);
    }
}