public class EmployeeSalaryValadation {
    public static void validateSalary(double salary)
            throws Exception {
        if (salary <= 0) {
            throw new Exception(
                "Employee salary must be greater than zero."
            );
        }
        System.out.println("Salary is valid.");
        System.out.println("Salary: $" + salary);
    }
    public static void main(String[] args) {
        double salary = -5000;
        try {
            validateSalary(salary);
        } catch (Exception e) {
            System.out.println("Salary Validation Failed.");
            System.out.println("Reason: " + e.getMessage());
        }
        System.out.println("Payroll processing completed.");
    }
}