/*Problem 8 — Check an Element Using contains()
Problem Statement

Create an Employee Skills List containing:

Java
Spring Boot
React
Python
SQL

Check whether the employee knows:

Spring Boot
AWS

using the contains() method. */
import java.util.ArrayList;
import java.util.List;
public class EmployeeSkills {
    public static void main(String args[]){
        List<String> skills = new ArrayList<>();

        skills.add("Java");
        skills.add("Spring Boot");
        skills.add("React");
        skills.add("Python");
        skills.add("SQL");

        System.out.println("Employee Skills");
        System.out.println(skills);

        // Check existing skill
        boolean hasSpringBoot = skills.contains("Spring Boot");

        // Check non-existing skill
        boolean hasAWS = skills.contains("AWS");

        System.out.println("\nKnows Spring Boot: " + hasSpringBoot);
        System.out.println("Knows AWS: " + hasAWS);
     }
}
