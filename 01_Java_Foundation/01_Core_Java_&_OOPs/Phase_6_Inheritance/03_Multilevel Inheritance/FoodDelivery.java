/*Problem Statement 1

Create a food-ordering application using multilevel inheritance.

Level 1 — Restaurant

Fields:

String restaurantName;
String location;

Method:

void displayRestaurant()
Level 2 — Order

Order extends Restaurant.

Add:

int orderId;
double foodAmount;

Method:

void displayOrder()
Level 3 — OnlineOrder

OnlineOrder extends Order.

Add:

double deliveryCharge;

Method:

void displayOnlineOrder()

Calculate:

Final Amount = Food Amount + Delivery Charge

Use:

Restaurant: Spice Garden
Location: Boston

Order ID: 501
Food Amount: $45

Delivery Charge: $5

Expected final amount:

$50 */
class Resturant{
    String resturantName;
    String location;

    void displayResturant(){
        System.out.println("Resturant:- " + resturantName);
        System.out.println("Location:- " + location);
    }
}

class Order extends Resturant{
    int orderId;
    double foodAmount;

    void displayOrder(){
        System.out.println("Order ID: " + orderId);
        System.out.println("Food Amount: $" + foodAmount);
    }
}

class OnlineOrder extends Order{
    double deliveryCharge;
    void displayOnlineOrder(){
        double finalAmount = foodAmount + deliveryCharge;
        System.out.println("Delivery Charge: $" + deliveryCharge);
        System.out.println("Final Amount: $" + finalAmount);
    }
}
public class FoodDelivery {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder();
        order.resturantName = "Spice Garden";
        order.location = "Boston";
        order.orderId = 501;
        order.foodAmount = 45;
        order.deliveryCharge = 5;
        order.displayResturant();
        order.displayOrder();
        order.displayOnlineOrder();
    }
}
