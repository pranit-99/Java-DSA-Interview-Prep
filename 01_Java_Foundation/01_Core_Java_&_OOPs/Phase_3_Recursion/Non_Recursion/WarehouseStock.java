/*Now we're moving from:

public static void method()

to a method that calculates something and gives the answer back to main().

We'll start with an int return type.

Problem 6 — Warehouse: Find the Most Stocked Product

A warehouse stores the quantity available for each product:

int[] stock = {45, 120, 75, 200, 150, 90, 180};

Each array position represents a product:

Product 1 → 45 units
Product 2 → 120 units
Product 3 → 75 units
Product 4 → 200 units
...

Create a method:

public static int findHighestStock(int[] stock)

The method should find the highest stock quantity and return it.

Expected result

For:

int[] stock = {45, 120, 75, 200, 150, 90, 180};

the method should return:

200

Then main() should print: */
public class WarehouseStock {
    public static  int findHigestStock(int stock[]){
        int highest = 0;
        for(int i = 0; i <  stock.length; i++){
            if(stock[i] > highest){
                highest = stock[i];
            }
        }
        return highest;

    }
    public static void main(String args[]){
        int stock[] = {45, 120, 75, 200, 150, 90, 180,250};
        int result = findHigestStock(stock);
        System.out.println("Higest Stock Quantity:-"+result);
    }
}
