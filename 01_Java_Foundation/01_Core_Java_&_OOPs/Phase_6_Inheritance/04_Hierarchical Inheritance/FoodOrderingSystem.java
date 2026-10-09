class FoodItem {

    protected String itemName;
    protected double basePrice;

    void displayFoodItem() {

        System.out.println(
            "Item: " + itemName
        );

        System.out.println(
            "Base Price: $" + basePrice
        );
    }
}


class Pizza extends FoodItem {

    double extraCheeseCost;

    void calculatePizzaPrice() {

        double finalPrice =
            basePrice + extraCheeseCost;

        System.out.println(
            "Pizza Price: $" + finalPrice
        );
    }
}


class Burger extends FoodItem {

    double extraPattyCost;

    void calculateBurgerPrice() {

        double finalPrice =
            basePrice + extraPattyCost;

        System.out.println(
            "Burger Price: $" + finalPrice
        );
    }
}


class Pasta extends FoodItem {

    double sauceCost;

    void calculatePastaPrice() {

        double finalPrice =
            basePrice + sauceCost;

        System.out.println(
            "Pasta Price: $" + finalPrice
        );
    }
}


public class FoodOrderingSystem {

    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        pizza.itemName = "Margherita Pizza";
        pizza.basePrice = 15;
        pizza.extraCheeseCost = 3;

        pizza.displayFoodItem();
        pizza.calculatePizzaPrice();

        System.out.println("----------------");

        Burger burger = new Burger();

        burger.itemName = "Chicken Burger";
        burger.basePrice = 10;
        burger.extraPattyCost = 4;

        burger.displayFoodItem();
        burger.calculateBurgerPrice();

        System.out.println("----------------");

        Pasta pasta = new Pasta();

        pasta.itemName = "Alfredo Pasta";
        pasta.basePrice = 12;
        pasta.sauceCost = 2;

        pasta.displayFoodItem();
        pasta.calculatePastaPrice();
    }
}