/*Problem 7: Food Ordering System

Now we'll introduce another important concept:

An interface can contain multiple abstract methods, and the implementing class must implement all of them.

Problem Statement

Create a food ordering system.

Create an interface FoodOrder containing three methods:

void prepareOrder();
double calculatePrice();
void deliverOrder();

Create two implementing classes:

PizzaOrder
BurgerOrder

Use different prices and preparation messages for each.

Finally, use interface references in main(). */
interface FoodOrder {

    void prepareOrder();

    double calculatePrice();

    void deliverOrder();

}


class PizzaOrder implements FoodOrder {

    @Override
    public void prepareOrder() {

        System.out.println("Preparing Pizza...");

    }

    @Override
    public double calculatePrice() {

        double pizzaPrice = 15.99;

        return pizzaPrice;

    }

    @Override
    public void deliverOrder() {

        System.out.println("Pizza is out for delivery.");

    }

}


class BurgerOrder implements FoodOrder {

    @Override
    public void prepareOrder() {

        System.out.println("Preparing Burger...");

    }

    @Override
    public double calculatePrice() {

        double burgerPrice = 10.99;

        return burgerPrice;

    }

    @Override
    public void deliverOrder() {

        System.out.println("Burger is out for delivery.");

    }

}


public class FoodOrderingSystem {

    public static void main(String[] args) {

        FoodOrder order1 = new PizzaOrder();

        FoodOrder order2 = new BurgerOrder();


        order1.prepareOrder();

        System.out.println(
            "Pizza Price: $" + order1.calculatePrice()
        );

        order1.deliverOrder();


        System.out.println("------------------------");


        order2.prepareOrder();

        System.out.println(
            "Burger Price: $" + order2.calculatePrice()
        );

        order2.deliverOrder();

    }

}