/*Problem 4 of 8 — E-Commerce Domain
Product → ElectronicProduct → Smartphone

Now we'll make the problem slightly more practical.

The main concept is:

A lowest-level child can perform calculations using data inherited from multiple levels.

We'll calculate a smartphone's final price after discount + warranty cost.

Problem Statement

Create this multilevel hierarchy:

Product
    ↓
ElectronicProduct
    ↓
Smartphone
Level 1 — Product

Fields:

protected String productName;
protected double price;

Method:

void displayProduct()
Level 2 — ElectronicProduct

ElectronicProduct extends Product.

Fields:

protected String brand;
protected int warrantyYears;

Method:

void displayElectronicDetails()
Level 3 — Smartphone

Smartphone extends ElectronicProduct.

Fields:

double discountPercentage;
double warrantyCostPerYear;

Method:

void calculateFinalPrice()

Calculate:

Discount Amount
= Price × Discount Percentage / 100

Discounted Price
= Price - Discount Amount

Warranty Cost
= Warranty Years × Warranty Cost Per Year

Final Price
= Discounted Price + Warranty Cost
Test Data
Product: Smartphone
Price: $1000

Brand: Samsung
Warranty: 2 years

Discount: 10%
Warranty Cost Per Year: $50

Calculation:

Discount
= 1000 × 10 / 100
= $100

Discounted Price
= 1000 - 100
= $900

Warranty Cost
= 2 × 50
= $100

Final Price
= 900 + 100
= $1000 */
class Product{
    protected String productName;
    protected double price;

    void displayProduct(){
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: $" + price);
    }
}

class ElectronicProduct extends Product{
    protected String brand;
    protected int warrantyYears;

    void displayElectronicDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warrantyYears + " years");
    }
}

class Smartphone extends ElectronicProduct{
    double discountPercentage;
    double warrantyCostPerYear;

    void calculateFinalPrice(){
        double discountAmount = price * discountPercentage / 100;
        double discountedPrice = price - discountAmount;
        double warrantyCost = warrantyYears * warrantyCostPerYear;
        double finalPrice = discountedPrice + warrantyCost;
        
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Price After Discount: $" + discountedPrice);
        System.out.println("Warranty Cost: $" + warrantyCost);
        System.out.println("Final Price: $" + finalPrice);
    }
}
public class EcommerceSystem {
    public static void main(String args[]){
        Smartphone phone = new Smartphone();

        phone.productName = "Smartphone";
        phone.price = 1000;
        phone.brand = "Samsung";
        phone.warrantyYears = 2;
        phone.discountPercentage = 10;
        phone.warrantyCostPerYear = 50;

        phone.displayProduct();
        phone.displayElectronicDetails();
        phone.calculateFinalPrice();
    }
}
