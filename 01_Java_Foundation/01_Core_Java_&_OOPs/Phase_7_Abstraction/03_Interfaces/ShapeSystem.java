/*Now we'll use the same interface method for two completely different mathematical calculations.

Problem Statement

Create a shape area calculator.

Requirements:

Create an interface Shape.
Declare double calculateArea().
Create Circle implementing Shape.
Create Rectangle implementing Shape.
Circle calculates area using π × radius × radius.
Rectangle calculates area using length × width.
Use interface references in main(). */
interface Shape {
    double calculateArea();
}


class Circle implements Shape {
    double radius = 5;
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Rectangle implements Shape {
    double length = 10;
    double width = 5;
    @Override
    public double calculateArea() {
        return length * width;
    }
}


public class ShapeSystem {

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        double circleArea = shape1.calculateArea();
        double rectangleArea = shape2.calculateArea();
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
    }
}
