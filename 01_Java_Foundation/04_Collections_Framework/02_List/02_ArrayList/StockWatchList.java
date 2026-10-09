/*ArrayList — Basic Problem 4: Indexed Access and Update

This problem focuses on one of the biggest advantages of ArrayList:

Fast index-based access using get() and set().

Problem Statement

Create a Stock Watchlist using ArrayList<String>.

Store:

Apple
Microsoft
Google
Amazon
Tesla

Then:

Retrieve the company at index 2.
Retrieve the last company.
Replace "Amazon" with "NVIDIA".
Print the updated watchlist.
Understand why get() and set() are typically O(1). */
import java.util.ArrayList;
public class StockWatchList {
    public static void main(String[] args) {
        ArrayList<String> stocks = new ArrayList<>();

        stocks.add("Apple");
        stocks.add("Microsoft");
        stocks.add("Google");
        stocks.add("Amazon");
        stocks.add("Tesla");

        //Access element using index
        String thirdStock = stocks.get(2);
        System.out.println("\nStock at index 2: "+ thirdStock);

        // Access last element
        String lastStock = stocks.get(stocks.size() - 1);
        System.out.println("Last Stock: "+ lastStock);

        // Replace Amazon with NVIDIA
        String oldStock = stocks.set(3, "NVIDIA");

        System.out.println("\nReplaced Stock: " + oldStock);

        System.out.println("Updated Watchlist:");
        System.out.println(stocks);

    }
}
