/*Guided Problem 1 — Vehicle System
Problem Statement

A transportation company has different types of vehicles. Every vehicle must be able to start, but different vehicles start differently.

For example:

Car  → Starts using push button
Bike → Starts using self-start

Create an abstract class called:

Vehicle

It should contain an abstract method:

abstract void start();

Create two child classes:

Car
Bike

Both should extend Vehicle and provide their own implementation of start().

In main(), create objects of Car and Bike and call their start() methods.

Expected Output
Car starts using push button
Bike starts using self-start */
abstract class Vehicle{

   
    @SuppressWarnings("unused")
    abstract void start();
}

class Car extends Vehicle{
    
    @Override 
    void start(){
        System.out.println("Car starts using push button");
    }
}

class Bike extends Vehicle{
    
    @Override 
    void start(){
        System.out.println("Bike starts using self-start");
    }
}
public class VehicleSystem {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        car.start();
        bike.start();

    }
}
