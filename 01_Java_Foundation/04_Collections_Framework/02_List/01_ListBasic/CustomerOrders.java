/*Problem 9 — Find Elements Using indexOf() and lastIndexOf()
Problem Statement

Create a Customer Order List containing:

Pizza
Burger
Pasta
Pizza
Sandwich
Pizza

Find:

The first occurrence of "Pizza".
The last occurrence of "Pizza".
The index of "Burger".
The index of "Biryani", which does not exist. */

import java.util.ArrayList;
import java.util.List;
public class CustomerOrders {
    public static void main(String args[]){
        List<String> orders = new ArrayList<>();

        orders.add("Pizza");
        orders.add("Burger");
        orders.add("Pasta");
        orders.add("Pizza");
        orders.add("Sandwich");
        orders.add("Pizza");

        System.out.println("Customer Orders:");
        System.out.println(orders);

        int firstPizza = orders.indexOf("Pizza");
        int lastPizza = orders.lastIndexOf("Pizza");
        int burgerIndex = orders.indexOf("Burger");
        int biryaniIndex = orders.indexOf("Biryani");

        System.out.println("\nFirst Pizza Index: " + firstPizza);
        System.out.println("Last Pizza Index: " + lastPizza);
        System.out.println("Burger Index: " + burgerIndex);
        System.out.println("Biryani Index: " + biryaniIndex);
     }
}
