/*Problem 2: Online Shopping Quantity
Problem Statement

Create a Java program for an online shopping system.

A customer purchases a certain number of products, and the program calculates the average cost per product.

Use these values:

int totalAmount = 1200;
int quantity = 0;

Calculate:

Average Cost = Total Amount / Quantity
Your Task

Create:

OnlineShopping.java

Use try-catch to handle the situation when quantity = 0.

Requirements

Your program should:

Create totalAmount and quantity.
Display both values.
Inside the try block, calculate:
int averageCost = totalAmount / quantity;
Catch the appropriate exception.
Print a meaningful message from the catch block.
After the try-catch, print:
Shopping calculation completed.
Expected Output when quantity = 0
Total Amount: $1200
Quantity: 0

Cannot calculate average cost.
Reason: Quantity cannot be zero.

Shopping calculation completed. */
public class OnlineShopping {
    public static void main(String[] args) {
        int totalAmount = 1200;
        int quantity = 0;

        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Quantity: " + quantity);

        try {
            int averageCost = totalAmount / quantity;
            System.out.println("Average Cost: $" + averageCost);
        } catch (ArithmeticException e) {
            System.out.println("Cannot calculate average cost.");
            System.out.println("Reason: Quantity cannot be zero.");
        }
        System.out.println("Shopping calculation completed.");
    }
}
