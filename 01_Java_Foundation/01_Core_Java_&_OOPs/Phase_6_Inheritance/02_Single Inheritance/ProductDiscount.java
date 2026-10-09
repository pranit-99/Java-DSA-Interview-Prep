/*Now we'll practice another important behavior:

A child method can call an inherited parent method from inside the child class.

So far:

Problem 1 → Basic inheritance
Problem 2 → Parent vs child members
Problem 3 → Child method uses inherited parent variable
Problem 4 → Child method calls inherited parent method
Problem Statement

Create an online shopping product system using single-level inheritance.

Parent Class — Product

Variables:

String productName;
double price;

Method:

void displayProduct()

It should display the product name and original price.

Child Class — DiscountedProduct

DiscountedProduct should inherit from Product.

Add:

double discountPercentage;

Create:

void displayFinalPrice()

Inside this method:

Call the inherited displayProduct() method.
Calculate the discount amount.
Calculate the final price.
Display discount percentage.
Display discount amount.
Display final price.
Formula
Discount Amount
      =
Price × Discount Percentage
────────────────────────────
            100

Then:

Final Price = Price - Discount Amount
Test Data
Product Name: Laptop
Price: $1200
Discount: 10%

Calculation:

Discount Amount
= 1200 × 10 / 100
= 120

Final Price
= 1200 - 120
= 1080
Expected Output
Product Name: Laptop
Original Price: $1200.0
Discount Percentage: 10.0%
Discount Amount: $120.0
Final Price: $1080.0 */
class Product{
    String productName;
    double price;

    void displayProduct() {
        System.out.println("Product Name: " + productName );
        System.out.println("Original Price: $"+ price);
    }
}

class DiscountedProduct extends Product{
    double discountPercentage;
    void displayFinalPrice(){
        displayProduct();
        double discountAmount = price * discountPercentage / 100;
        double finalPrice = price - discountAmount;
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Final Price: $" + finalPrice);
    }
}
public class ProductDiscount {
    public static void main(String args[]){
        DiscountedProduct product = new DiscountedProduct();
        product.productName = "Laptop";
        product.price = 1200;
        product.discountPercentage = 10;
        product.displayFinalPrice();
    }
}
