/*Problem 4 — Update an Element Using set()
Problem Statement

Create a Software Development Project Task List using List<String>.

Add:

Requirement Analysis
Backend Development
Database Design
Testing
Deployment

The second task "Backend Development" needs to be changed to "API Development".

Use the set() method to update it and display the List before and after the change. */
import java.util.ArrayList;
import java.util.List;

public class ProjectTaskList {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();

        tasks.add("Requirement Analysis");
        tasks.add("Backend Development");
        tasks.add("Database Design");
        tasks.add("Testing");
        tasks.add("Deployment");
        System.out.println("Original Tasks:");
        System.out.println(tasks);

        tasks.set(1, "API Development");
        System.out.println("\nUpdated Tasks:");
        System.out.println(tasks);
        }
}
