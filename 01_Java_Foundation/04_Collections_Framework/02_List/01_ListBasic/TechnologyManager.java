/*Problem 11 — Complete List Management Operations

This problem combines 9 remaining related List operations into one simple program.

Problem Statement

Create a Software Project Technology List.

Start with:

Java
Spring Boot
React
SQL

Then perform the following operations:

Check the number of technologies using size().
Check whether the List is empty using isEmpty().
Display elements using a traditional for loop.
Display elements using an enhanced for loop.
Add multiple technologies using addAll().
Check multiple technologies using containsAll().
Remove multiple technologies using removeAll().
Keep only selected technologies using retainAll().
Remove everything using clear(). */
import java.util.ArrayList;
import java.util.List;
public class TechnologyManager {
    public static void main(String args[]){
        List<String> technologies = new ArrayList<>();

        technologies.add("Java");
        technologies.add("Spring Boot");
        technologies.add("React");
        technologies.add("SQL");

        System.out.println("Original Technologies:");
        System.out.println(technologies);

        //1. Size
        System.out.println("Total Technologies: " +technologies.size());

        //2. isEmpty
        System.out.println("\nTotal TEchnologies: "+technologies.size());

        //3. Traditional for loop
        System.out.println("\nUsing Traditional For Loop:");
        for(int i = 0; i < technologies.size(); i++){
            System.out.println(i +" -> "+ technologies.get(i));
        }

        //4. Enhanced for Loop
        System.out.println("Using Enhanced for Loop");
        for(String technology : technologies){
            System.out.println(technology);
        }

        //5. add all()
        List<String> newTechnologies = new ArrayList<>();
        newTechnologies.add("Python");
        newTechnologies.add("Docker");
        newTechnologies.add("AWS");

        technologies.addAll(newTechnologies);
        System.out.println("\nAfter addAll():");
        System.out.println(technologies);

        // 6. containsAll()
        List<String> requiredTechnologies = new ArrayList<>();

        requiredTechnologies.add("Java");
        requiredTechnologies.add("React");

        boolean hasRequired =
                technologies.containsAll(requiredTechnologies);

        System.out.println(
                "\nContains Java and React? " + hasRequired
        );


        // 7. removeAll()
        List<String> technologiesToRemove = new ArrayList<>();

        technologiesToRemove.add("React");
        technologiesToRemove.add("SQL");

        technologies.removeAll(technologiesToRemove);

        System.out.println("\nAfter removeAll():");
        System.out.println(technologies);


        // 8. retainAll()
        List<String> technologiesToKeep = new ArrayList<>();

        technologiesToKeep.add("Java");
        technologiesToKeep.add("Spring Boot");
        technologiesToKeep.add("AWS");

        technologies.retainAll(technologiesToKeep);

        System.out.println("\nAfter retainAll():");
        System.out.println(technologies);


        // 9. clear()
        technologies.clear();

        System.out.println("\nAfter clear():");
        System.out.println(technologies);

        System.out.println(
                "Is List Empty? " + technologies.isEmpty()
        );

    }
}
