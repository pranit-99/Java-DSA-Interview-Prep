/*Food Delivery Charge Calculator

In Problem 1, our overridden methods simply printed different values.

Now we'll make overriding more practical: each child class will override the same method and return a calculated value.

Problem Statement

A food-delivery application supports three delivery types:

Delivery
   |
   ├── StandardDelivery
   ├── ExpressDelivery
   └── PremiumDelivery

The parent class has:

calculateDeliveryCharge(double distance)

Each delivery type calculates its charge differently:

Standard Delivery → $2 per mile
Express Delivery  → $3 per mile
Premium Delivery  → $5 per mile

For a distance of:

10 miles

we expect:

Standard → $20
Express  → $30
Premium  → $50
Complete Solution */
class Delivery {

    public double calculateDeliveryCharge(double distance) {
        return 0;
    }
}


class StandardDelivery extends Delivery {

    @Override
    public double calculateDeliveryCharge(double distance) {
        double charge = distance * 2;
        return charge;
    }
}


class ExpressDelivery extends Delivery {

    @Override
    public double calculateDeliveryCharge(double distance) {
        double charge = distance * 3;
        return charge;
    }
}


class PremiumDelivery extends Delivery {

    @Override
    public double calculateDeliveryCharge(double distance) {
        double charge = distance * 5;
        return charge;
    }
}


public class DeliveryMain {

    public static void main(String[] args) {

        Delivery delivery1 = new StandardDelivery();
        Delivery delivery2 = new ExpressDelivery();
        Delivery delivery3 = new PremiumDelivery();

        double charge1 = delivery1.calculateDeliveryCharge(10);
        double charge2 = delivery2.calculateDeliveryCharge(10);
        double charge3 = delivery3.calculateDeliveryCharge(10);

        System.out.println("Standard Delivery Charge: $" + charge1);
        System.out.println("Express Delivery Charge: $" + charge2);
        System.out.println("Premium Delivery Charge: $" + charge3);
    }
}
