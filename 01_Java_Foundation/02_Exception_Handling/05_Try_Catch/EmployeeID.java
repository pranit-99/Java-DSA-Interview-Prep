public class EmployeeID {
    public static void main(String[] args) {
        String employeeID = "EMP101";
        System.out.println("Employee ID:" + employeeID);

        try {
            int id = Integer.parseInt(employeeID);
            System.out.println("Converted Employee ID:" + id);
        } catch (NumberFormatException e) {
            System.out.println("Cannot convert Employee ID.");
            System.out.println("Reason: Employee ID contains non-numeric characters.");
        }
        System.out.println("Employee ID processing completed.");
    }
}
