/*Employee Registration — Constructor Overloading

Now we'll cover:

Constructors can also be overloaded.

This is called Constructor Overloading.

It allows us to create objects in different ways depending on how much information is available.

Problem Statement

Imagine an HR system where a new employee can be registered with different amounts of information.

An employee may be created using:

Option 1: Employee name only

Employee(String name)

Option 2: Employee name + employee ID

Employee(String name, int employeeId)

Option 3: Employee name + employee ID + department

Employee(String name, int employeeId, String department)

Create these three overloaded constructors and a method:

displayEmployee()

to display the employee information. */
public class EmployeeRegistration {
    String name;
    int employeeId;
    String department;


    // Constructor 1
    public EmployeeRegistration(String name) {

        this.name = name;
    }


    // Constructor 2
    public EmployeeRegistration(String name, int employeeId) {

        this.name = name;

        this.employeeId = employeeId;
    }


    // Constructor 3
    public EmployeeRegistration(String name,
                    int employeeId,
                    String department) {

        this.name = name;

        this.employeeId = employeeId;

        this.department = department;
    }


    // Display Employee Information
    public void displayEmployee() {

        System.out.println("Employee Name: " + name);

        System.out.println("Employee ID: " + employeeId);

        System.out.println("Department: " + department);
    }


    public static void main(String[] args) {

        EmployeeRegistration employee1 = new EmployeeRegistration("Pranit");
        EmployeeRegistration employee2 = new EmployeeRegistration("John", 102);
        EmployeeRegistration employee3 = new EmployeeRegistration("Sarah", 103, "Engineering");
                


        System.out.println("Employee 1");

        employee1.displayEmployee();


        System.out.println("-------------------------");


        System.out.println("Employee 2");

        employee2.displayEmployee();


        System.out.println("-------------------------");


        System.out.println("Employee 3");

        employee3.displayEmployee();
}

}
