/*Employee Search System

This problem teaches the third important way of achieving method overloading:

Changing the order of parameter types.

Problem Statement

Imagine an HR application where employees can be searched using their employee ID and department.

The application supports:

searchEmployee(int employeeId, String department)

and:

searchEmployee(String department, int employeeId)

Notice that both methods have:

Same method name
Same number of parameters
Same parameter types
But a different order of parameter types */
public class EmployeeSearch {

    public void searchEmployee(int employeeId, String department){
        System.out.println("Searching Employee using ID first");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }

    public void searchEmployee(String department, int employeeId){
        System.out.println("Searching Employee using Department first");
        System.out.println("Department: " + department);
        System.out.println("Employee ID: " + employeeId);
    }
    public static void main(String args[]){
        EmployeeSearch employee = new EmployeeSearch();

        System.out.println("Search 1");
        employee.searchEmployee(101, "Engineering");

        System.out.println("----------------------------");
        System.out.println("Search 2");
        employee.searchEmployee("Finance", 205);
    }
}
