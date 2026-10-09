/*Problem 12 — Final List Basics Problem

This is our final List Basics problem. We'll combine the remaining concepts into one program, but keep each section separate so your notes remain clear.

We'll cover:

1. subList()
2. Iterator
3. ListIterator
4. Arrays.asList()
5. List.of()
6. Mutable vs Fixed-size vs Unmodifiable
7. Custom Objects in List
Part 1 — subList()
Problem

A company maintains a list of project phases:

Planning
Design
Development
Testing
Deployment
Maintenance

Retrieve only:

Development
Testing
Deployment */
import java.util.ArrayList;
import java.util.List;

public class SubListExample {

    public static void main(String[] args) {

        List<String> phases = new ArrayList<>();

        phases.add("Planning");
        phases.add("Design");
        phases.add("Development");
        phases.add("Testing");
        phases.add("Deployment");
        phases.add("Maintenance");

        System.out.println("All Phases:");
        System.out.println(phases);

        List<String> selectedPhases = phases.subList(2, 5);

        System.out.println("\nSelected Phases:");
        System.out.println(selectedPhases);
    }
}