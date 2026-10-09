/*Problem 9 — Shopping Cart Final Price Calculator

A customer has the following item prices in their shopping cart:

double[] prices = {120.50, 75.25, 200.00, 50.75, 100.00};

Create a method:

public static double calculateFinalPrice(double[] prices)

The method should first calculate the total cart amount.

Then apply a discount based on the total:

Total >= $500       → 20% discount
Total >= $300       → 10% discount
Total >= $100       → 5% discount
Total <  $100       → No discount

The method should return the final price after discount. */
public class ShoppingCart {

    public static double calculateFinalPrice(double[] prices) {

        double total = 0;

        // Calculate total price
        for (int i = 0; i < prices.length; i++) {
            total = total + prices[i];
        }

        double discount = 0;

        // Determine discount percentage
        if (total >= 500) {

            discount = total * 20 / 100;

        } else if (total >= 300) {

            discount = total * 10 / 100;

        } else if (total >= 100) {

            discount = total * 5 / 100;

        }

        // Calculate final price
        double finalPrice = total - discount;

        // Return result to main()
        return finalPrice;
    }

    public static void main(String[] args) {

        double[] prices = {120.50, 75.25, 200.00, 50.75, 100.00};

        double finalPrice = calculateFinalPrice(prices);

        System.out.println("Final Price: $" + finalPrice);
    }
}
