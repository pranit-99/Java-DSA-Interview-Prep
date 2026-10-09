/*E-Commerce Order Processor — Final Basics Problem

This is the final problem for 01_Exception_Basics.

This time we'll combine String parsing + arrays + calculations + program flow. I won't immediately tell you the exception at the beginning—you should learn to identify it from the code.

Problem Statement

An e-commerce system receives an order with the following information:

Customer       → "Amit"
Product        → "Laptop"
Price          → $1200
Quantity Input → "Two"
Stock          → 10

The important detail is that the quantity arrives as a String because it came from user input/API data:

String quantityInput = "Two";

The application needs to:

Display the order information.
Convert the quantity into an integer.
Calculate the total order amount.
Reduce inventory.
Display the remaining inventory.
Handle any conversion problem.
Continue and complete the order-processing session. */
public class OrderProcessor {
    
    public static void main(String[] args) {

        String customerName = "Amit";
        String productName = "Laptop";

        int productPrice = 1200;
        int availableStock = 10;

        String quantityInput = "Two";

        System.out.println( "Order Processing Started");

        System.out.println("Customer: " + customerName);

        System.out.println("Product: " + productName);

        System.out.println("Product Price: $" + productPrice);

        try {

            int quantity =Integer.parseInt(quantityInput);

            int totalAmount =productPrice * quantity;

            availableStock =availableStock - quantity;

            System.out.println("Quantity: " + quantity);

            System.out.println("Total Amount: $"+ totalAmount);

            System.out.println( "Remaining Stock: " + availableStock);

            System.out.println("Order processed successfully.");

        } catch (NumberFormatException e) {

            System.out.println("Invalid quantity entered.");

            System.out.println("Quantity must contain numbers only.");
        }

        System.out.println("Order Processing Completed");
    }
}

