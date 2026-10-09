/*Basic Interface — Problem 2: Vehicle Start System

This problem introduces an important interface concept:

One interface can have multiple implementing classes, and each class can provide its own implementation of the same method.

Problem Statement

Create a vehicle system where different vehicles start differently.

Requirements:

Create an interface Vehicle.
Declare a method start().
Create a Car class that implements Vehicle.
Create a Bike class that implements Vehicle.
Both classes should provide their own implementation of start().
Use interface references in main().
Complete Solution */
interface Vehicle{
    void start();
}

class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car starts using push button.");
    }
}

class Bike implements Vehicle{
    @Override 
    public void start(){
        System.out.println("Bike starts using self-start button.");
    }
}

public class VehicleSystem {
    public static void main(String args[]){
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();
        vehicle1.start();
        vehicle2.start();
    }
}
