/*Exception Basics — Problem 6 of 8
Product Inventory Lookup — Exception Inside a Loop

Now we'll combine your previous knowledge of arrays + loops + basic exception handling.

The important concept is:

What happens when an exception occurs while a loop is running?

Problem Statement

An inventory system stores quantities of products:

Product 1 → 50
Product 2 → 25
Product 3 → 80
Product 4 → 15
Product 5 → 40

The program tries to display 7 products, even though the array contains only 5.

Your program should:

Create an inventory array.
Use a for loop to display products.
Intentionally loop beyond the valid array indexes.
Observe the exception.
Handle ArrayIndexOutOfBoundsException.
Observe what happens to the loop after the exception.
Allow the program to continue afterward. */
public class ProductInventory {
    public static void main(String[] args) {
       int[] inventory = {50, 25, 80, 15, 40};

        System.out.println( "Inventory Processing Started");
        try {
            for (int i = 0; i < 7; i++) {

            System.out.println("Product " + (i + 1) + " Quantity: "+ inventory[i]
            );
        }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid inventory position detected.");
        }
        System.out.println("Inventory Processing Completed"); 
    }
}
