/*Shopping Discount Calculator

Now we'll combine concepts you've already learned:

Same method name
Different parameter types/counts
Calculations
Returning values
Problem Statement

An online shopping system calculates discounts in different ways.

Option 1 — No discount

Customer provides only the product price:

calculateFinalPrice(double price)

Return the original price.

Option 2 — Percentage discount

Customer provides price and discount percentage:

calculateFinalPrice(double price, int discountPercentage)

Example:

Price = $1000
Discount = 10%

Final Price = $900
Option 3 — Fixed discount

Customer provides price and fixed discount amount using a double:

calculateFinalPrice(double price, double fixedDiscount)

Example:

Price = $1000
Fixed Discount = $150

Final Price = $850

Notice something important:

calculateFinalPrice(double, int)

versus:

calculateFinalPrice(double, double)

They both have two parameters, but the second parameter has a different type. */
public class DiscountCalculator {
    public double calculateFinalPrice(double price){
        return price;
    }

    public double calculateFinalPrice(double price, int discountPercentage){
        double discountAmount = price * discountPercentage / 100;
        double finalPrice = price - discountAmount;

        return finalPrice;
    }

    public double calculateFinalPrice(double price, double fixedDiscount){
        double finalPrice = price = fixedDiscount;
        return finalPrice;
    }

    public static void main(String args[]){
        DiscountCalculator calculator = new DiscountCalculator();

        // No Discount
        double result1 = calculator.calculateFinalPrice(1000);
        System.out.println("Original Price: $" + result1);
        System.out.println("-------------------------");

        // 10% Discount
        double result2 =
                calculator.calculateFinalPrice(
                        1000, 10);

        System.out.println(
                "Price after 10% Discount: $" + result2);


        System.out.println("-------------------------");


        // $150 Fixed Discount
        double result3 =
                calculator.calculateFinalPrice(
                        1000, 150.0);

        System.out.println(
                "Price after $150 Fixed Discount: $" + result3);
    }
}
