/*Problem 6 — Remove an Element by Value Using remove(Object)
Problem Statement

Create a Shopping Cart using List<String>.

Add:

Laptop
Mouse
Keyboard
Headphones
Webcam

The customer decides they no longer want "Keyboard".

Remove "Keyboard" using its value, not its index. */
import java.util.ArrayList;
import java.util.List;
public class ShoopingCart {
   public static void main(String args[]){
    List<String> cart = new ArrayList<>();

        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.add("Headphones");
        cart.add("Webcam");

        System.out.println("Original Cart:");
        System.out.println(cart);

        cart.remove("Keyboard");

        System.out.println("\nUpdated Cart:");
        System.out.println(cart);
   } 
}
