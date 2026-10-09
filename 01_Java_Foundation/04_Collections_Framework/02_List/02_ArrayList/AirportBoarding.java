
/*ArrayList — Basic Problem 5: Insertion and Element Shifting

This problem focuses on:

Why add(index, element) can be O(n) in an ArrayList.

Problem Statement

Create an Airport Boarding Queue using ArrayList<String>.

Initially store:

Alice
Bob
David
Emma

A passenger named Charlie must be inserted at index 2.

Then:

Print the original list.
Insert Charlie at index 2.
Print the updated list.
Print the size.
Understand how elements shift internally.*/
import java.util.ArrayList;
public class AirportBoarding {
    public static void main(String[] args) {
        ArrayList<String> passengers = new ArrayList<>();

        passengers.add("Alice");
        passengers.add("Bob");
        passengers.add("David");
        passengers.add("Emma");

        System.out.println("Original Boarding List:");
        System.out.println(passengers);

        // Insert Charlie at index 2
        passengers.add(2, "Charlie");

        System.out.println("\nAfter inserting Charlie:");
        System.out.println(passengers);

        System.out.println("\nTotal Passengers: "
                + passengers.size());

    }
}
