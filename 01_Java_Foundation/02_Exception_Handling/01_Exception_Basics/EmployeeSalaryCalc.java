/*Problem Statement

A payroll system calculates an employee's average monthly bonus.

Employee information:

Employee Name     → Pranit
Base Salary       → $80,000
Annual Bonus      → $12,000
Months Worked     → 0

The system calculates:

Average Monthly Bonus
=
Annual Bonus / Months Worked

Because:

Months Worked = 0

the calculation will cause an ArithmeticException.

Your program should:

Store employee information.
Print employee details.
Start salary processing.
Calculate average monthly bonus.
Calculate total compensation.
Handle the exception.
Continue execution after handling it. */
public class EmployeeSalaryCalc {
    public static void main(String[] args) {
        String employeeName  = "Pranit";

        int baseSalary  = 80000;
        int annualBonus = 12000;
        int monthsWorked = 0;

        System.out.println("Payroll Processing Staretd");
        System.out.println("Employee Name:" + employeeName);
        System.out.println("Base Salary" + baseSalary);

        try{
            System.out.println("Calculating monthly bonus..");
            int averageMonthlyBonus =annualBonus / monthsWorked;
        int totalCompensation =baseSalary + annualBonus;

        System.out.println("Average Monthly Bonus: $"+ averageMonthlyBonus);
        System.out.println("Total Compensation: $"+ totalCompensation);
        }catch(ArithmeticException e){
            System.out.println("Unable to calculate monthly bonus.");
            System.out.println("Months worked cannot be zero.");
        }
        System.out.println("Payroll Processing Completed");
    }
}
