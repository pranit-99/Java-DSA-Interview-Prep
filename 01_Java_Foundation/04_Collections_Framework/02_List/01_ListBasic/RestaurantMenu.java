/*Problem 5 — Remove an Element Using remove(index)
Problem Statement

Create a Restaurant Menu List using List<String>.

Add:

Paneer Tikka
Butter Chicken
Biryani
Pasta
Gulab Jamun

The restaurant has decided to remove "Biryani" from the menu.

Remove it using its index and display the updated menu. */
import java.util.ArrayList;
import java.util.List;

public class RestaurantMenu {

    public static void main(String[] args) {

        List<String> menu = new ArrayList<>();

        menu.add("Paneer Tikka");
        menu.add("Butter Chicken");
        menu.add("Biryani");
        menu.add("Pasta");
        menu.add("Gulab Jamun");

        System.out.println("Original Menu:");
        System.out.println(menu);

        // Remove element at index 2
        menu.remove(2);

        System.out.println("\nUpdated Menu:");
        System.out.println(menu);
    }
}
