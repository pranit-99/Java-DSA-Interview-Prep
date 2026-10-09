/*Problem 3 — Retrieve Elements Using get()
Problem Statement

Create an Employee Department List using List<String>.

Add these departments:

Engineering
Finance
Marketing
Human Resources
Operations

Retrieve and display:

The first department
The third department
The last department

Use the get() method.

Solution */
import java.util.ArrayList;
import java.util.List;

public class EmpoyeeDepartment {
    public static void main(String[] args) {
        List<String> departments = new ArrayList<>();

        departments.add("Engineering");
        departments.add("Finance");
        departments.add("Marketing");
        departments.add("Human Resources");
        departments.add("Operations");

        System.out.println("All Departments:");
        System.out.println(departments);

        //Get first deparment
        System.out.println("First Department:" + departments.get(0));
        System.out.println("First Department:" + departments.get(3));
    }
    }

