/*This problem remains pure single-level inheritance, but we'll add multiple parent and child properties so you become comfortable using inherited members.

Concept
Vehicle
   ↑
  Car

A Car IS-A Vehicle.

Problem Statement

Create a Java program using two classes.

Parent class — Vehicle

Variables:

String brand;
int speed;

Method:

void displayVehicleDetails()

This method should display the vehicle's brand and speed.

Child class — Car

The Car class should inherit Vehicle.

Add:

String model;
double price;

Method:

void displayCarDetails()

This method should display the model and price.

In main():

Create a Car object.
Assign:
Brand = "Toyota"
Speed = 180
Model = "Camry"
Price = 32000
Call the inherited parent method.
Call the child's own method.
Expected Output
Vehicle Brand: Toyota
Maximum Speed: 180 km/h
Car Model: Camry
Car Price: $32000.0 */
class Vehicle{
    String brand;
    int speed;

    void displayVehicleDetails(){
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Maximum Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle{
    String model;
    double price;

    void displayCardetails(){
        System.out.println("Car Model: " + model);
        System.out.println("Car Price: $" + price);
    }
}
public class VehicleCar {
    public static void main(String[] args) {
        Car car = new Car();

        car.brand = "Toyota";
        car.speed = 180;

        car.model = "Camry";
        car.price = 32000;

        car.displayVehicleDetails();
        car.displayCardetails();
    }
}
