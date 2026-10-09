/*E-Commerce Product Search

This problem will teach a different overloading rule from Problem 1.

In Problem 1, we overloaded by changing the number of parameters.

Here, we'll overload by changing the parameter data type.

Problem Statement

Imagine an e-commerce application where customers can search for a product in different ways:

By product ID → int
By product name → String
By price → double

We want all three operations to use the same method: */
public class ProductSearch {
    public void searchProduct(int productId){
        System.out.println("Searching Product by ID");
        System.out.println("Product ID: " + productId);
    }

    public void searchProduct(String productName){
        System.out.println("Searching Product by Name");
        System.out.println("Product Name: " + productName);
    }

    public void searchProduct(double price){
        System.out.println("Searching Product by Price");
        System.out.println("Product Price: $" + price);
    }
    public static void main(String args[]){
        ProductSearch product = new ProductSearch();

        System.out.println("Search 1");
        product.searchProduct(101);

        System.out.println("-----------------------------");

        System.out.println("Search 2");
        product.searchProduct("MacBook pro");

        System.out.println("-----------------------------");
        System.out.println("Search 3");
        product.searchProduct(1499.99);

    }
}
