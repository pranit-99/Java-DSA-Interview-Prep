public class EmployeeSalary {
    public static void main(String[] args) {
        int salaries[] = {5000, 6000, 75000, 8200};

        int employeeIndex = 2;
        int workingDays = 0;

        try {
            int salary = salaries[employeeIndex];
            System.out.println("Employee Salary: $" + salary);
            int salaryPerDay = salary / workingDays;
            System.err.println("Salary Per Day: $" + salaryPerDay);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Employee not found.");
            System.out.println("Reason: Invalid employee index.");
        } catch (ArithmeticException e){
            System.out.println("Cannot calculate salary per day.");
            System.out.println("Reason: Working days cannot be zero.");
        }
        System.out.println("Salary processing completed.");
    }
}
