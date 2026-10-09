/*Guided Problem 4 — Shape Area Calculator

Now we'll add one new abstraction concept:

An abstract method can return a value.

Until now, we used:

abstract void start();

and:

abstract void calculateInterest(double balance);

void means the method doesn't return anything.

Now we'll use:

abstract double calculateArea();
Problem Statement

A drawing application supports different shapes:

Rectangle
Circle

Every shape must be able to calculate its area, but the formula is different for each shape.

Create an abstract class:

Shape

with an abstract method:

abstract double calculateArea();

Create two child classes:

Rectangle
Circle

For this basic problem, store the required values directly inside each child class.

Use:

Rectangle:
length = 10
width  = 5

Circle:
radius = 7

Formulas:

Rectangle Area = length × width

Circle Area = π × radius × radius

Use:

Math.PI

for π.

Expected Output

Approximately:

Rectangle Area: 50.0
Circle Area: 153.93804002589985 */
abstract class Shape{
    @SuppressWarnings("unused")
    abstract double calculateArea();
}

class Rectangle extends Shape{
    double length = 10;
    double width =5;

    @Override
    double calculateArea(){
        double area = length * width;
        return area;
    }
}

class Circle extends Shape{
    double radius = 7;

    @Override
    double calculateArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
}
public class ShapeArea {
    public static void main(String[] args) {
        
    
    Rectangle rectangle = new Rectangle();
    Circle circle = new Circle();

    double rectangleArea = rectangle.calculateArea();
    double circleArea = circle.calculateArea();

    System.out.println("Rectangle Area: " + rectangleArea);
    System.out.println("Circle Area:" + circleArea);
}
}
