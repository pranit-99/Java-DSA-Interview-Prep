/*ArrayList — Basic Problem 2: Initial Capacity vs Size

This is an important ArrayList-specific concept.

Problem Statement

A company expects to store up to 10 employee names, so create an ArrayList<String> with an initial capacity of 10.

Then:

Print the size immediately after creation.
Add 3 employees.
Print the size again.
Retrieve the first employee.
Understand why capacity 10 does not mean size 10.
Solution */
import java.util.ArrayList;

public class EmployeeArrayList {
    public static void main(String[] args) {
       // ArrayList with initial capacity of 10
       ArrayList<String> employees  = new ArrayList<>(10);

       System.out.println("Size after creation:" +employees.size());

       // Adding employees
       employees.add("John");
       employees.add("Sarah");
       employees.add("David");

       System.out.println("\nEmployees:");
       System.out.println(employees);
       System.out.println("\nSize after adding employees: "+ employees.size());

        System.out.println("First Employee: "+ employees.get(0));


    }
}
