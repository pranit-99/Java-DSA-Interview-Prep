/*Problem 1 — Create a List and Add Elements
Problem Statement

Create a Student Course Registration System.

Store these courses in a List<String>:

Java
Python
Database
Spring Boot
React

Display the complete list. */
import java.util.ArrayList;
import java.util.List;
public class CourseRegistration {
    public static void main(String args[]){
        //Create List
        List<String> courses = new ArrayList<>();

        //Add Courses
        courses.add("Java");
        courses.add("Python");
        courses.add("Database");
        courses.add("Spring Boot");
        courses.add("React");

        System.out.println("Registered Courses");
        System.out.println(courses);
    }
}
