/*Problem 5:- Food Delivery SystemNow we'll reinforce a very important idea:

One abstract method can have completely different implementations in multiple child classes.

Problem Statement

A food delivery application supports different delivery methods:

BikeDelivery
CarDelivery
DroneDelivery

Every delivery method must calculate its delivery charge, but each method calculates it differently.

Create an abstract class:

Delivery

with:

abstract double calculateDeliveryCharge(double distance);

Use these basic rules:

Bike  → $2 per mile
Car   → $3 per mile
Drone → $5 per mile

Use:

distance = 10 miles
Expected Output
Bike Delivery Charge: $20.0
Car Delivery Charge: $30.0
Drone Delivery Charge: $50.0 */
abstract class Delivery{
    @SuppressWarnings("unused")
    abstract double calculateDeliveryCharge(double distance);
}

class BikeDelivery extends Delivery{
    @Override
    double calculateDeliveryCharge(double distance){
        double charge = distance * 2;
        return charge;
    }
}

class CarDelivery extends Delivery {
    @Override
    double calculateDeliveryCharge(double distance) {
        double charge = distance * 3;
        return charge;
    }
}

class DroneDelivery extends Delivery {
    @Override
    double calculateDeliveryCharge(double distance) {
        double charge = distance * 5;
        return charge;
    }
}

public class FoodDeliverySystem {
    public static void main(String args[]){
        BikeDelivery bike = new BikeDelivery();
        CarDelivery car = new CarDelivery();
        DroneDelivery drone =new DroneDelivery();

        double bikeCharge = bike.calculateDeliveryCharge(10);
        double carCharge = car.calculateDeliveryCharge(10);
        double droneCharge = drone.calculateDeliveryCharge(10);


        System.out.println("Bike Delivery Charge: $" + bikeCharge);
        System.out.println("Car Delivery Charge: $" + carCharge);
        System.out.println("Drone Delivery Charge: $" + droneCharge);
    }
}
